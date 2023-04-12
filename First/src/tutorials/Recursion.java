package firstPackage.First.src.tutorials;

public class Recursion {
    int calculateFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * calculateFactorial(number - 1));
        }
    }
}