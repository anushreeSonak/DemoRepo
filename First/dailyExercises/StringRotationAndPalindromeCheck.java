package firstPackage.First.dailyExercises;

public class StringRotationAndPalindromeCheck {

    public static boolean areRotations(String data, String mockData) {
        if (data.length() != mockData.length()) {
            return false;
        }
        String concatenated = data + data;
        return concatenated.contains(mockData);
    }

    public static boolean isPalindrome(String palindromeData) {
        int left = 0;
        int right = palindromeData.length() - 1;

        while (left < right) {
            if (palindromeData.charAt(left) != palindromeData.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String data = "acarr";
        String mockData = "racar";
        if (areRotations(data, mockData)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
        if (isPalindrome(data)) {
            System.out.println(data + " is a palindrome.");
        } else {
            System.out.println(data + " is not a palindrome.");
        }
    }
}