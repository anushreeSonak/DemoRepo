package firstPackage.First.dailyExercises;

public class InsertString {
    // Function to insert string
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        // Create a new string
        String newString = originalString.substring(0, index + 1) + stringToBeInserted + originalString.substring(index + 1);
        return newString;
    }

    public static void main(String[] args) {
        // Get the Strings
        String originalString = "Hello  World ";
        String stringToBeInserted = "IT";
        int index = 5;
        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);
        // Insert the String
        System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));
    }
}
//OUTPUT: "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64400:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.InsertString
//Original String: Hello  World
//String to be inserted: IT
//String to be inserted at index: 5
//Modified String: Hello IT World
//
//Process finished with exit code 0