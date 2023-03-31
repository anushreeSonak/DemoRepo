package firstPackage;


import java.util.ArrayList;
import java.util.List;

public class findDestination {
    public static String destinationCity(List<List<String>> paths)
    {
        List<String> outElemet1 = new ArrayList<>();
        List<String> inElement1 = new ArrayList<>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> Elements = paths.get(i);
            String outElement = Elements.get(0);
            String inElement = Elements.get(1);
            outElemet1.add(outElement);
            inElement1.add(inElement);
        }
        for (int i = 0; i < outElemet1.size(); i++) {
            String inElement = inElement1.get(i); //local variable
            if (!outElemet1.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        List<List<String>> testList = new ArrayList<>();
        List<String> listString1 = new ArrayList<>();
        listString1.add("London");
        listString1.add("New York");
        List<String> listString2 = new ArrayList<>();
        listString2.add("New York");
        listString2.add("Lima");
        List<String> listString3 = new ArrayList<>();
        listString3.add("Lima");
        listString3.add("Sao Paulo");
        testList.add(listString1);
        testList.add(listString2);
        testList.add(listString3);
        String returnDestination = destinationCity(testList);
        System.out.println(returnDestination);
    }
}