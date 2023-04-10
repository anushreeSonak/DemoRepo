package firstPackage.First.src.MediumDifficultyAssignmnets;

public class AlternateChar {
    public static void main(String args[]) {
        String result = mergeStringAlternatively("abc", "xyz");
        System.out.println(result);
    }

    public static String mergeStringAlternatively(String firstString, String secondString) {
        String mergeString = "";
        for (int i = 0; i < firstString.length() || i < secondString.length(); i++) {
            if (i < firstString.length())
                mergeString += firstString.charAt(i);
            if (i < secondString.length())
                mergeString += secondString.charAt(i);
        }
        return mergeString;
    }
}