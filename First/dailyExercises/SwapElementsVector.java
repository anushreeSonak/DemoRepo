package firstPackage.First.dailyExercises;

import java.util.Collections;
import java.util.Vector;

public class SwapElementsVector {
    public static void main(String[] args) {
        Vector<String> data = new Vector();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        System.out.println(data);
        Collections.swap(data, 0, 4);
        System.out.println("Elements After swapping");
        System.out.println(data);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64662:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.SwapElementsVector
//[1, 2, 3, 4, 5]
//Elements After swapping
//[5, 2, 3, 4, 1]
//
//Process finished with exit code 0