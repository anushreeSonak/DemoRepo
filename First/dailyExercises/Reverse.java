package firstPackage.First.dailyExercises;

public class Reverse {
    public static void main(String[] args) {
        String string = "Anushree Sonak";
        //Stores the reverse of given string
        String reversedStr = "";
        //Iterate through the string from last and add each character to variable reversedStr
        for (int index = string.length() - 1; index >= 0; index--) {
            reversedStr = reversedStr + string.charAt(index);
        }
        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64034:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\DailyAssignments\DemoRepo\First\out\production\First1 firstPackage.First.dailyExercises.Reverse
//Original string: Anushree Sonak
//Reverse of given string: kanoS eerhsunA
//Process finished with exit code 0