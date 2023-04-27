package firstPackage.First.src.MediumDifficultyAssignmnets;

public class JavaTest {
    public static int commonSubstring(String firstString, String secondString) {
        int lengthOfString = firstString.length();
        int lengthOfStringSecond = secondString.length();
        int count[][] = new int[lengthOfString + 1][lengthOfStringSecond + 1];
        int result = 0;
        for (int index = 0; index <= lengthOfString; index++) {
            for (int letter = 0; letter <= lengthOfStringSecond; letter++) {
                if (index == 0 || letter == 0) {
                    count[index][letter] = count[index - 1][letter - 1] + 1;
                    result = Math.max(index, letter);
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        String firstString = "abcdxyz";
        String secondString = "xyzabcd";
        //  int result = commonSubstring(String varOne, String varTwo);
        System.out.println("The Length of Longest Common Substring is: " + commonSubstring(firstString, secondString));
    }
}