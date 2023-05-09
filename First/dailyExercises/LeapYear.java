package firstPackage.First.dailyExercises;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 400 == 0)
            System.out.println(year + " is a Leap Year");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64715:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.LeapYear
//2020 is a Leap Year
//Process finished with exit code 0