package firstPackage.First.dailyExercises;

public class RemoveNonAlphabeticCharacters {
    public static void main(String[] args) {
        String input = "Anushree1234!@#sonak";
        String result = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("Original String: " + input);
        System.out.println("String with only alphabets: " + result);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=52513:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.RemoveNonAlphabeticCharacters
//Original String: Anushree1234!@#sonak
//String with only alphabets: Anushreesonak
//Process finished with exit code 0