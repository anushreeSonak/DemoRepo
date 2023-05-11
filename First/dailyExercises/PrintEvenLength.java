package firstPackage.First.dailyExercises;

public class PrintEvenLength {
    public static void printWords(String s) {
        // Splits String
        for (String word : s.split(" "))
            // if length is even
            if (word.length() % 2 == 0)
                // Print the word
                System.out.println(word);
    }

    public static void main(String[] args) {
        String s = "I am Anushree sonak and I am from kothrud pune";
        printWords(s);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=59346:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.PrintEvenLength
//am
//Anushree
//am
//from
//pune
//
//Process finished with exit code 0