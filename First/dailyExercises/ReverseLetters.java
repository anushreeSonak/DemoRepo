package firstPackage.First.dailyExercises;

public class ReverseLetters {
    public static void main(String[] args) {
        String mockData = "Anu";
        String[] arrayData = mockData.split(" ");
        for (String temp : arrayData) {
            System.out.println(temp);
        }
        for (int index = 0; index < 1; index++) {
            char[] letter = arrayData[index].toCharArray();
            for (int subIndex = letter.length - 1; subIndex >= 0; subIndex--) {
                System.out.print(letter[subIndex]);
            }
            System.out.print(" ");
        }
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=63969:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.ReverseLetters
//Anu
//unA
//Process finished with exit code 0