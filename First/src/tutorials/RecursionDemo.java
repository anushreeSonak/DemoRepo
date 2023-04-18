package firstPackage.First.src.tutorials;

public class RecursionDemo {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int Result = recursion.calculateFactorial(5);
        System.out.println("Factorial of 5 is:" + Result);
    }
}
//OUTPUT:-"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61204:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.RecursionDemo
//Factorial of 5 is:120
//Process finished with exit code 0