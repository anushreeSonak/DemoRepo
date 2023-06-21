package firstPackage.First.mediumComplexity;

public class PrintBoundaryElements {
    
    public void boundaryElement(int data[][]) {
        // Printing Input Matrix;
        System.out.println("Input Matrix is : ");
        for (int index = 0; index < data.length; index++) {
            for (int subIndex = 0; subIndex < data[index].length; subIndex++) {
                System.out.print(data[index][subIndex]);
            }
            System.out.println();
        }
        // Printing Boundary Values of Matrix
        System.out.println("Resultant Matrix is :");
        for (int index = 0; index < data.length; index++) {
            for (int subIndex = 0; subIndex < data[index].length; subIndex++) {
                if (index == 0 || subIndex == 0 || index == data.length - 1
                        || subIndex == data[index].length - 1) {
                    System.out.print(data[index][subIndex]);
                } else {
                    // Printing Space if element is not at Boundary
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Input Matrix
        int data[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PrintBoundaryElements mockData = new PrintBoundaryElements();
        mockData.boundaryElement(data);
    }
}