package firstPackage.First.src.MediumDifficultyAssignmnets;

public class Pyramid {
    public static void main(String args[]) {
        patternMethod(4);
    }

    public static void patternMethod(int row) {
        for (int varOne = 1; varOne <= row; varOne++) {
            for (int varTwo = 1; varTwo <= row - varOne; varTwo++) {
                System.out.print(" ");
            }
            for (int varThree = varOne; varThree >= 1; varThree--) {
                System.out.print(varThree);
            }
            for (int varFour = 2; varFour <= varOne; varFour++) {
                System.out.print(varFour);
            }
            System.out.println();
        }
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=61761:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.MediumDifficultyAssignmnets.Pyramid
//   1
//  212
// 32123
//4321234
//Process finished with exit code 0