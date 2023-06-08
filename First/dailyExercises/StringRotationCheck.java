package firstPackage.First.dailyExercises;

public class StringRotationCheck {
    public static boolean areRotations(String data, String mockData) {
        // Check if both strings have the same length
        if (data.length() != mockData.length()) {
            return false;
        }
        // Concatenate str1 with itself
        String concatenated = data + data;
        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(mockData);
    }

    public static void main(String[] args) {
        String data = "abcd";
        String mockData = "cdab";
        if (areRotations(data, mockData)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
}
//OUTPUT: "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=55292:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.StringRotationCheck
//The strings are rotations of each other.
//
//Process finished with exit code 0