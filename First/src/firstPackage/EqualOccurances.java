package firstPackage.First.src.firstPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualOccurances {
    public static boolean NumberOfOccurances(String input) {
        Map<Character, Integer> countOccurances = new HashMap<>();
        char[] charOne = input.toCharArray();
        for (char ch : charOne) {
            if (countOccurances.get(ch) != null) {
                countOccurances.put(ch, countOccurances.get(ch) + 1);
            } else {
                countOccurances.put(ch, 1);
            }
        }
        Set<Integer> setOne = new HashSet<>();
        setOne.addAll(countOccurances.values());
        if (setOne.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean Result = NumberOfOccurances("aaabbbccc");
        if (Result)
            System.out.println("All Characters Have equal Number of Occurrences");
        else
            System.out.println("All Characters Have NOT equal Number of Occurrences");
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=51168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.firstPackage.EqualOccurances
//All Characters Have equal Number of Occurrences
//Process finished with exit code 0