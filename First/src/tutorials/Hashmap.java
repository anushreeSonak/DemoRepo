package firstPackage.First.src.tutorials;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        System.out.println("Size of the Map is: " + map.size());
        System.out.println(map);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61470:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.Hashmap
//Size of the Map is: 3
//{a=10, b=20, c=30}
//Process finished with exit code 0