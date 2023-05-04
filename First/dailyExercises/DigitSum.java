package firstPackage.First.dailyExercises;

public class DigitSum {
    public static int sumOfDigits(int num) {
        // base case
        if (num == 0) {
            return 0;
        } else {
            // recursive case
            return (num % 10) + sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 259;
        int sum = sumOfDigits(num);
        System.out.println("The sum of digits in " + num + " is " + sum);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=65422:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.DigitSum
//The sum of digits in 259 is 16
//Process finished with exit code 0