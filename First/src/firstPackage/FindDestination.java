package firstPackage.First.src.firstPackage;

import java.util.*;

public class FindDestination {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        System.out.println(paths);
        String destination = findDestination(paths);
        System.out.println(destination);
    }

    public static String findDestination(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();
        Set<String> endCities = new HashSet<>();
        for (List<String> path : paths) {
            startCities.add(path.get(0));
            endCities.add(path.get(1));
        }
        for (String endCity : endCities) {
            if (!startCities.contains(endCity)) {
                return endCity;
            }
        }
        return null;
    }
}
//OUTPUT:-//"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=53022:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.firstPackage.FindDestination
//[[London, New York], [New York, Lima], [Lima, Sao Paulo]]
//Sao Paulo
//Process finished with exit code 0