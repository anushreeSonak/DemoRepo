package firstPackage.First.dailyExercises;

public class StringRotationAndPalindromeCheck {

    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        String str3 = "madam";

        // Check if str1 and str2 are rotations of each other
        if (areRotations(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }

        // Check if str3 is a palindrome
        if (isPalindrome(str3)) {
            System.out.println(str3 + " is a palindrome.");
        } else {
            System.out.println(str3 + " is not a palindrome.");
        }
    }
}

