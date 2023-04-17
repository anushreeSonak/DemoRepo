package firstPackage.First.src.firstPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualOccurances {
    public static boolean numberOfOccurences(String input) {
        Map<Character, Integer> countOccurances = new HashMap<>();
        char[] characterString = input.toCharArray();
        for (char ch : characterString) {
            countOccurances.put(ch, countOccurances.containsKey(ch) ? countOccurances.get(ch) + 1 : 1);
        }
        Set<Integer> setChar = new HashSet<>();
        setChar.addAll(countOccurances.values());
        return setChar.size() == 1 ? true : false;
    }

    public static void main(String[] args) {
        boolean Result = numberOfOccurences("aaabbbccc");
        System.out.println(Result ? "All Characters Have equal Number of Occurrences" : "All Characters Have NOT equal Number of Occurrences");
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=57692:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.firstPackage.EqualOccurances
//All Characters Have equal Number of Occurrences
//Process finished with exit code 0