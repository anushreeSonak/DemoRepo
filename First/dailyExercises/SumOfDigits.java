package firstPackage.First.dailyExercises;

public class SumOfDigits {
    //function that finds the sum of digits of a number
    static int findSum(int number) {
        //variable that stores the sum
        int sum = 0;
        //executes until the condition becomes false
        while (number != 0) {
            //finds the last digit from the number and add it to the variable sum
            sum = sum + number % 10;
            //removes the last digit
            number = number / 10;
        }
        //returns the sum
        return sum;
    }

    public static void main(String args[]) {
        int number = 253;
        //calling the method and prints the result
        System.out.println("The sum of digits: " + findSum(number));
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=60805:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.SumOfDigits
//The sum of digits: 10
//
//Process finished with exit code 0