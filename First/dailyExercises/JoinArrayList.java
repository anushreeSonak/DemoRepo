package firstPackage.First.dailyExercises;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String args[])
    {
        // Get the ArrayList1
        ArrayList<String> listData = new ArrayList<String>();
        // Populate the ArrayList
        listData.add("Anushree");
        listData.add("Sonak");
        listData.add("JuniorQA");
        // Print the ArrayList 1
        System.out.println("First ArrayList : " + listData);
        // Get the ArrayList2
        ArrayList<String> listMockData = new ArrayList<String>();
        listMockData.add("AnushreeSonakJuniorQA");
        listMockData.add("at Encora");
        // Print the ArrayList 2
        System.out.println("Second ArrayList is: " + listMockData);
        // Join the ArrayLists
        // using Collection.addAll() method
        listData.addAll(listMockData);
        // Print the joined ArrayList
        System.out.println("Joined ArrayLists: " + listData);
    }
}
//OUTPUT: "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=63176:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.JoinArrayList
//First ArrayList : [Anushree, Sonak, JuniorQA]
//Second ArrayList is: [AnushreeSonakJuniorQA, at Encora]
//Joined ArrayLists: [Anushree, Sonak, JuniorQA, AnushreeSonakJuniorQA, at Encora]
//
//Process finished with exit code 0