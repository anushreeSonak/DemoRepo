package firstPackage.First.dailyExercises;

public class Armstrong {
    public static void main(String[] args) {
        int num = 407, len;
        // function to get order(length)
        len = order(num);
        // check if Armstrong
        if (armstrong(num, len))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is  not an Armstrong Number");
    }

    public static int order(int var) {
        int len = 0;
        while (var != 0) {
            len++;
            var = var / 10;
        }
        return len;
    }

    public static boolean armstrong(int num, int len) {
        int sum = 0, temp, digit;
        temp = num;
        // loop to extract digit, find power & add to sum
        while (temp != 0) {
            // extract digit
            digit = temp % 10;
            // add power to sum
            sum = sum + (int) Math.pow(digit, len);
            temp /= 10;
        }
        return num == sum;
    }
}
//Output:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=55576:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.Armstrong
//407 is an Armstrong Number
//Process finished with exit code 0