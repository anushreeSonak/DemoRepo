package firstPackage.First.src.MediumDifficultyAssignmnets;

public class AnnualSalary {
    private static float tax;
    private static float taxableAmount;

    public float displayIncomeTax(float income) {
        int Incomeslab = (income < 500000) ? 1 : (500000 <= income && income <= 700000)
                ? 2 : (700000 < income && income <= 1000000) ? 3 : (income <= 1500000) ? 4 : 5;
        switch (Incomeslab) {
            case 1:
                System.out.println("you are tax free ");
                break;
            case 2:
                taxableAmount = income - 500000;
                tax = (0.10f) * taxableAmount;
                System.out.println("you are in 10 %");
                break;
            case 3:
                taxableAmount = income - 700000;
                tax = (0.15f) * taxableAmount + (0.1F * 200000);
                System.out.println("you are in 15 %");
                break;
            case 4:
                taxableAmount = income - 1000000;
                tax = (0.20f) * taxableAmount + (0.15F * 300000) + (0.1F * 200000);
                System.out.println("you are in 20 %");
                break;
            case 5:
                taxableAmount = income - 1000000;
                tax = (0.30f) * taxableAmount + (0.2F * 500000) + (0.15F * 300000) + (0.1F * 200000);
                System.out.println("you are in 30 %");
                break;
            default:
                System.out.println("Enter valid input");
        }
        System.out.println("you are taxAmount is" + tax);
        return tax;
    }

    public static void main(String[] args) {
        AnnualSalary taxCalculator = new AnnualSalary();
        taxCalculator.displayIncomeTax(900000);
    }
}