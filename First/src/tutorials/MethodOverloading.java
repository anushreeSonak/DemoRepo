package firstPackage.First.src.tutorials;

public class MethodOverloading {

    public int Multiply(int varOne, int varTwo) {
        return (varOne * varTwo);
    }

    public int Multiply(int varOne, int varTwo, int varThree) {
        return (varOne * varTwo * varThree);
    }

    public double Multiply(double varOne, double varTwo) {
        return (varOne * varTwo);
    }

    public static void main(String args[]) {
        MethodOverloading MO = new MethodOverloading();
        System.out.println(MO.Multiply(20, 50));
        System.out.println(MO.Multiply(10, 50, 20));
        System.out.println(MO.Multiply(2.5, 5.0));
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61512:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo tutorials.MethodOverloading
//1000
//10000
//12.5
//Process finished with exit code 0