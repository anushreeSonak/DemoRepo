package firstPackage.First.src.firstPackage;

import java.util.*;

public class FindDestination {
    public static String destinationCity(List<List<String>> paths) {
        List<String> outElementOne = new ArrayList<>();
        List<String> inElementOne = new ArrayList<>();
        for (int index = 0; index < paths.size(); index++) {
            List<String> Elements = paths.get(index);
            String outElement = Elements.get(0);
            String inElement = Elements.get(1);
            outElementOne.add(outElement);
            inElementOne.add(inElement);
        }
        for (int index = 0; index < outElementOne.size(); index++) {
            String inElement = inElementOne.get(index);
            if (!outElementOne.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        List<List<String>> varList = new ArrayList<>();
        List<String> listStringOne = new ArrayList<>();
        listStringOne.add("London");
        listStringOne.add("New York");
        List<String> listStringTwo = new ArrayList<>();
        listStringTwo.add("New York");
        listStringTwo.add("Lima");
        List<String> listStringThree = new ArrayList<>();
        listStringThree.add("Lima");
        listStringThree.add("Sao Paulo");
        varList.add(listStringOne);
        varList.add(listStringTwo);
        varList.add(listStringThree);
        String returnDestination = destinationCity(varList);
        System.out.println(returnDestination);
    }
}
//OUTPUT:-"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=57782:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.FindDestination
//Sao Paulo
//Process finished with exit code 0