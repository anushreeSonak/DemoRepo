package firstPackage.First.src.tutorials;

public class UncheckedException {
    public static void main(String args[]) {
        int number[] = {1, 2, 3, 4};
        System.out.println(number[5]);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61559:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.UncheckedException
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
//	at firstPackage.First.src.tutorials.UncheckedException.main(UncheckedException.java:6)
//Process finished with exit code 1