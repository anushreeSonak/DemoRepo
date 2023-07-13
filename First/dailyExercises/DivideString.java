package firstPackage.First.dailyExercises;

public class DivideString {
    public static void main(String[] args) {
        String bunchOfString = "aaaabbbbcccc";
        int length = bunchOfString.length();
        int numberOfPart = 3;
        int temporary = 0, chars = length / numberOfPart;
        String[] equalStr = new String[numberOfPart];
        if (length % numberOfPart != 0) {
            System.out.println("Sorry this string cannot be divided into " + numberOfPart + " equal parts.");
        } else {
            for (int index = 0; index < length; index = index + chars) {
                String part = bunchOfString.substring(index, index + chars);
                equalStr[temporary] = part;
                temporary++;
            }
            System.out.println(numberOfPart + " equal parts of given string are ");
            for (int index = 0; index < equalStr.length; index++) {
                System.out.println(equalStr[index]);
            }
        }
    }
}