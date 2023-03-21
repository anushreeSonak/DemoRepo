import java.util.Scanner;

public class AnnualSalary1 {
    public static void main(String[] args) {
        float income;
        float tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income ");

        income = sc.nextFloat();
        if (income <= 500000) {
            System.out.println("You are Tax free");      //Nill
        } else if (income >= 500000 && income < 700000) //both true then if
        {
            float amount = income - 500000;     //declare variable    6L-5L=1L
            tax = (0.10f) * amount;  //0.1* 1L
            System.out.println("Your are tax is :" + tax);

        } else if (income > 700000 && income <= 1000000) {
            float amount1 = income - 700000;
            tax = (0.15f) * amount1;
            System.out.println("Your are tax is :" + tax);
        } else if (income > 1000000 && income <= 1500000) {
            float amount2 = income - 1000000;
            tax = (0.20f) * amount2;
            System.out.println("Your are tax is :" + tax);
        } else {
            float amount3 = income - 1000000;
            tax = (0.30f) * amount3;
            System.out.println("Your are tax is :" + tax);
        }
    }


}















