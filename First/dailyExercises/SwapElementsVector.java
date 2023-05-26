package firstPackage.First.dailyExercises;

import java.util.Collections;
import java.util.Vector;

public class SwapElementsVector {
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<String> data = new Vector<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");
        data.add("E");
        // Print the initial elements
        System.out.println("Initial Vector: " + data);
        swapElements(data, 0, 4);
        // Print the Vector after swapping
        System.out.println("Vector After Swapping: " + data);
    }

    public static void swapElements(Vector<String> vector, int index, int subIndex) {
        if (index < 0 || index >= vector.size() || subIndex < 0 || subIndex >= vector.size()) {
            System.out.println("Invalid indices. Unable to swap elements.");
            return;
        }
        // Swap the elements using Collections.swap()
        Collections.swap(vector, index, subIndex);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=57973:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.SwapElementsVector
//Initial Vector: [A, B, C, D, E]
//Vector After Swapping: [E, B, C, D, A]
//
//Process finished with exit code 0