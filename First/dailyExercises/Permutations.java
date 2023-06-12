package firstPackage.First.dailyExercises;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<>();
        permute("", input, permutations);
        return permutations;
    }

    private static void permute(String prefix, String suffix, List<String> permutations) {
        if (suffix.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int index = 0; index < suffix.length(); index++) {
                String newPrefix = prefix + suffix.charAt(index);
                String newSuffix = suffix.substring(0, index) + suffix.substring(index + 1);
                permute(newPrefix, newSuffix, permutations);
            }
        }
    }

    public static void main(String[] args) {
        String input = "anu";
        List<String> permutations = findPermutations(input);
        System.out.println("Permutations of " + input + ":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}