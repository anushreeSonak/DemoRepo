package firstPackage.First.dailyExercises;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String data, String mockData) {
        // Remove whitespace and convert strings to lowercase
        data = data.replaceAll("\\s", "").toLowerCase();
        mockData = mockData.replaceAll("\\s", "").toLowerCase();
        // Check if the lengths are different
        if (data.length() != mockData.length()) {
            return false;
        }
        // Convert strings to character arrays and sort them
        char[] charArray = data.toCharArray();
        char[] charArrayData = mockData.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArrayData);
        // Compare sorted character arrays
        return Arrays.equals(charArray, charArrayData);
    }

    public static void main(String[] args) {
        String data = "listen";
        String mockData = "silent";
        if (areAnagrams(data, mockData)) {
            System.out.println(data + " and " + mockData + " are anagrams.");
        } else {
            System.out.println(data + " and " + mockData + " are not anagrams.");
        }
    }
}