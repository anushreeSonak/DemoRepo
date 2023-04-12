package firstPackage.First.src.tutorials;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");
        System.out.println(treeSet);
        System.out.println(treeSet.contains("C"));
        treeSet.remove("A");
        System.out.println(treeSet);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61464:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.TreeSetDemo
//[A, B, C]
//true
//[B, C]
//Process finished with exit code 0