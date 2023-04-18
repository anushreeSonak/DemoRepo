package firstPackage.First.src.MediumDifficultyAssignmnets;

public class AnnualSalary {
    public static void main(String[] args) {
        AnnualSalary taxSalaryObject = new AnnualSalary();
        taxSalaryObject.taxSalaryCount(800000);
    }

    public void taxSalaryCount(int salary) {
        double taxAmount = 0;
        int caseValue = 0;
        caseValue = (salary <= 700000) ? 1 : (salary > 700000 && salary <= 1000000) ? 2 : (salary > 1000000 && salary <= 1500000) ? 3 : 4;
        switch (caseValue) {
            case 1: {
                taxAmount = 0;
                break;
            }
            case 2: {
                taxAmount = (0.15 * (salary - 700000)) + (0.1 * 200000);
                break;
            }
            case 3: {
                taxAmount = (0.2 * (salary - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
                break;
            }
            case 4: {
                taxAmount = (0.3 * (salary - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
                break;
            }
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Income tax is = " + Math.round(taxAmount));
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=56660:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.MediumDifficultyAssignmnets.AnnualSalary
//Income tax is = 35000
//Process finished with exit code 0