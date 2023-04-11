package firstPackage.First.src.tutorials;

import java.util.ArrayList;

public class LanguageList {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();
        // add() method without the index parameter
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61417:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.LanguageList
//ArrayList: [Java, C, Python]
//Process finished with exit code 0