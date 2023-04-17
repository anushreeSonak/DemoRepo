package firstPackage.First.src.tutorials;

import java.util.LinkedList;

public class CharacterLinkedList {

    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<String>();
        nameList.add("Ravi");
        nameList.add("Vijay");
        nameList.add("Anushree");
        nameList.add("Vikrant");
        nameList.add("Kanchan");
        nameList.add("Revati");
        System.out.println("Initial list of elements: " + nameList);
        //Removing specific element from arraylist
        nameList.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + nameList);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=53900:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.CharacterLinkedList
//Initial list of elements: [Ravi, Vijay, Anushree, Vikrant, Kanchan, Revati]
//After invoking remove(object) method: [Ravi, Anushree, Vikrant, Kanchan, Revati]
//Process finished with exit code 0