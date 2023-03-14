package firstPackage;

public class Example2 {

	 public static void main(String[] args) {
	        String s = "aaabb";
	        boolean result = checkString(s);
	        System.out.println(result);
	    }

	    public static boolean checkString(String s) {
	        int[] count = new int[26];

	        for (int i = 0; i < s.length(); i++) {
	            count[s.charAt(i) - 'a']++;
	        }

	        int targetCount = s.length() / 3;

	        for (int element : count) {
	            if ((element != 0) && (element > targetCount)) {
	                return false;
	            }
	        }

	        return true;
	    }
	

	}


