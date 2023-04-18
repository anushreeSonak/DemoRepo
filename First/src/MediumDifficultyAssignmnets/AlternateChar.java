package firstPackage.First.src.MediumDifficultyAssignmnets;

public class AlternateChar {
    public static void main(String args[]) {
        String result = mergeStringAlternatively("abc", "xyz");
        System.out.println(result);
    }

    public static String mergeStringAlternatively(String firstString, String secondString) {
        String mergeString = "";
        for (int varOne = 0; varOne < firstString.length() || varOne < secondString.length(); varOne++) {
            if (varOne < firstString.length())
                mergeString += firstString.charAt(varOne);
            if (varOne < secondString.length())
                mergeString += secondString.charAt(varOne);
        }
        return mergeString;
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=62412:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.MediumDifficultyAssignmnets.AlternateChar
//axbycz
//Process finished with exit code 0