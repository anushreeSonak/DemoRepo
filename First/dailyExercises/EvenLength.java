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