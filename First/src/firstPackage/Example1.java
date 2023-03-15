package firstPackage;

public class Example1 {

	public static boolean sameOccurrence(String s) {
        // Create an array to count the occurrences of each character
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        // Check if all counts are the same
        int firstCount = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (firstCount == -1) {
                    firstCount = count[i];
                } else if (count[i] != firstCount) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abacccbc";
        boolean result = sameOccurrence(s);
        System.out.println(result);
    }



	}


