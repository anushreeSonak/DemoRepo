package test;


import java.util.ArrayList;
import java.util.List;

public class FindDestination {
    public static String destinationCity(List<List<String>> paths) {
        List<String> outElementOne = new ArrayList<>();
        List<String> inElementOne = new ArrayList<>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> Elements = paths.get(i);
            String outElement = Elements.get(0);
            String inElement = Elements.get(1);
            outElementOne.add(outElement);
            inElementOne.add(inElement);
        }
        for (int i = 0; i < outElementOne.size(); i++) {
            String inElement = inElementOne.get(i);
            if (!outElementOne.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        List<List<String>> testList = new ArrayList<>();
        List<String> listStringOne = new ArrayList<>();
        listStringOne.add("London");
        listStringOne.add("New York");
        List<String> listStringTwo = new ArrayList<>();
        listStringTwo.add("New York");
        listStringTwo.add("Lima");
        List<String> listStringThree = new ArrayList<>();
        listStringThree.add("Lima");
        listStringThree.add("Sao Paulo");
        testList.add(listStringOne);
        testList.add(listStringTwo);
        testList.add(listStringThree);
        String returnDestination = destinationCity(testList);
        System.out.println(returnDestination);
    }
}

