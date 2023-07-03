package firstPackage.First.dailyExercises;

public class AverageValue {

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        double average = calculateAverage(array);
        System.out.println("The average value of the array elements is: " + average);
    }
}