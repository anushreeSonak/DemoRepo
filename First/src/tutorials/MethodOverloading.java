package tutorials;

public class MethodOverloading {

    public int Multiply(int varOne, int varTwo) {
        return (varOne * varTwo);
    }

    public int Multiply(int varOne, int varTwo, int varThree) {
        return (varOne * varTwo * varThree);
    }

    public double Multiply(double varOne, double varTwo) {
        return (varOne * varTwo);
    }

    public static void main(String args[]) {
        MethodOverloading MO = new MethodOverloading();
        System.out.println(MO.Multiply(20, 50));
        System.out.println(MO.Multiply(10, 50, 20));
        System.out.println(MO.Multiply(2.5, 5.0));
    }
}