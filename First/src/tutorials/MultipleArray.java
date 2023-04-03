package tutorials;

public class MultipleArray {

    public static void main(String[] args) {
        public static void printArrays (String[]arrOne,int[] arrTwo)
        {
			System.out.println("Printing string array:");
		}
            for (String s : arrOne) {
                System.out.println(s);
            }
            System.out.println("Printing integer array:");
            for (int i : arrTwo) {
                System.out.println(i);
            }
        }

        public static void main (String[]args)
        {
            String[] strArr = {"apple", "banana", "orange"};
            int[] intArr = {1, 2, 3, 4};
            // Calling the new method and passing in the arrays
            printArrays(strArr, intArr);
        }
    }





