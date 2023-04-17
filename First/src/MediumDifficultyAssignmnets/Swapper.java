package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    public static int count = 0, index = 1;

    public int primeOrNot(int lastNum) {
        if (index <= lastNum) {
            if (lastNum % index == 0) {
                count++;
            }
            index++;
            primeOrNot(lastNum);
        }
        return count;
    }

    public static void main(String arg[]) {
        Swapper prime = new Swapper();
        int[] inputArray = new int[]{1, 2, 3, 7};
        int lastNum = inputArray[inputArray.length - 1];
        int result = prime.primeOrNot(lastNum);
        if (result == 2) {
            System.out.println(lastNum + " : is prime number ");
            int temp = 0;
            temp = inputArray[0];
            inputArray[0] = inputArray[inputArray.length - 1];
            inputArray[inputArray.length - 1] = temp;
            System.out.println("The swap array is: " + Arrays.toString(inputArray));
        } else
            System.out.println("is NOT a prime number ");
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=53710:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.MediumDifficultyAssignmnets.Swapper
//7 : is prime number
//The swap array is: [7, 2, 3, 1]
//Process finished with exit code 0