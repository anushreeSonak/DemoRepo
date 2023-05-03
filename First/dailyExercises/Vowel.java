package firstPackage.First.dailyExercises;

public class Vowel {
    public static void main(String args[]) {

        String data = new String("anushreee");
        for (int index = 0; index < data.length(); index++) {
            if (data.charAt(index) == 'a' || data.charAt(index) == 'e' ||
                    data.charAt(index) == 'i' || data.charAt(index) == 'o' ||
                    data.charAt(index) == 'u')
                System.out.println("Given string contains " + data.charAt(index) + " at the index " + index);
        }
    }
}
//OUTPUT:"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=49728:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.Vowel
//Given string contains a at the index 0
//Given string contains u at the index 2
//Given string contains e at the index 6
//Given string contains e at the index 7
//Given string contains e at the index 8
//Process finished with exit code 0