package firstPackage.First.dailyExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElements {
    public static void main(String[] args) {
        // List initialization
        List<Integer> data = new ArrayList<>();
        // Add elements in the list
        data.add(3);
        data.add(5);
        data.add(18);
        data.add(4);
        data.add(6);
        // Minimum in the list
        int minimum = Collections.min(data);
        // Maximum in the list
        int maximum = Collections.max(data);
        if (minimum == maximum) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Min value of our list : " + minimum);
            System.out.println("Max value of our list : " + maximum);
        }
    }
}
//OUTPUT: "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=52721:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.CompareElements
//Min value of our list : 3
//Max value of our list : 18
//
//Process finished with exit code 0