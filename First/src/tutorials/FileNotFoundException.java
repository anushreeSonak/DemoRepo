package firstPackage.First.src.tutorials;

import java.io.IOException;
import java.io.FileInputStream;

public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("AnushreeFile.txt");
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
//OUTPUT:-"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=57005:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.FileNotFoundException
//java.io.FileNotFoundException: AnushreeFile.txt (The system cannot find the file specified)
//Process finished with exit code 0