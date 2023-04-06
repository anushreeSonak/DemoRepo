package firstPackage.First.src.firstPackage;

public class EqualOccurances {
    public static boolean equalNumberOccurances(String input) {
        boolean output = true;
        int firstCount = 1;
        for (int count = 0; count < input.length(); count++) {
            char stringchar = input.charAt(count);
            int secondCount = 1;
            for (int i = 0; i < input.length(); i++) {
                if (count == i)
                    continue;
                if (stringchar == input.charAt(i)) {
                    if (count == 0) {
                        firstCount++;
                    }
                    secondCount++;
                }
            }
            if (firstCount != secondCount) {
                output = false;
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        boolean output = equalNumberOccurances("abacbc");
        if (output == true)
            System.out.println("All Characters Have equal Number of Occurrences");
        else
            System.out.println("All Characters Have not equal Number of Occurrences");
    }
}