package firstPackage.First.dailyExercises;

public class EvenLength {
    public static void printWords(String data) {
        // Splits Str
        for (String word : data.split(" "))
            // if length is even
            if (word.length() % 2 == 0)
                // Print the word
                System.out.println(word);
    }

    public static void main(String[] args) {
        String data = "Hello World I am Anushree S Sonak";
        printWords(data);
    }
}
//OUTPUT:"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=58799:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.EvenLength
//am
//Anushree
//
//Process finished with exit code 0