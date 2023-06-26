package firstPackage.First.dailyExercises;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<String> findPermutations(String data) {
        List<String> mockData = new ArrayList<>();
        permute("", data, mockData);
        return mockData;
    }

    private static void permute(String prefix, String suffix, List<String> mockData) {
        if (suffix.length() == 0) {
            mockData.add(prefix);
        } else {
            for (int index = 0; index < suffix.length(); index++) {
                String prefixData = prefix + suffix.charAt(index);
                String suffixData = suffix.substring(0, index) + suffix.substring(index + 1);
                permute(prefixData, suffixData, mockData);
            }
        }
    }

    public static void main(String[] args) {
        String data = "anu";
        List<String> mockData = findPermutations(data);
        System.out.println("Permutations of " + data + ":");
        for (String permutation : mockData) {
            System.out.println(permutation);
        }
    }
}