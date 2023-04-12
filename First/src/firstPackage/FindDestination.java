package firstPackage.First.src.firstPackage;

import java.util.*;

public class FindDestination {
    public static String destCity(ArrayList<LinkedList> paths) {
        String output = "";
        List<String> startCity = new LinkedList<>();
        List<String> endCity = new LinkedList<>();
        for (LinkedList<String> path : paths) {
            startCity.add(path.get(0));
            endCity.add(path.get(1));
        }
        for (String inElement : endCity) {
            if (!startCity.contains(inElement)) {
                output = inElement;
                break;
            }
        }
        return output;
    }

    public static void main(String args[]) {
        LinkedList<String> firstList = new LinkedList();
        firstList.add("London");
        firstList.add("New york");
        LinkedList<String> secondList = new LinkedList();
        secondList.add("New york");
        secondList.add("Lima");
        LinkedList<String> thirdList = new LinkedList();
        thirdList.add("Lima");
        thirdList.add("Sao paulo");
        ArrayList<LinkedList> paths = new ArrayList<LinkedList>();
        paths.add(firstList);
        paths.add(secondList);
        paths.add(thirdList);
        System.out.println(paths);
        String returnDest = destCity(paths);
        System.out.println(returnDest);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=63740:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.firstPackage.FindDestination
//[[London, New york], [New york, Lima], [Lima, Sao paulo]]
//Sao paulo
//Process finished with exit code 0