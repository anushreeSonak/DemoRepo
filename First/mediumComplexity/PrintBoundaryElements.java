package firstPackage.First.mediumComplexity;

public class PrintBoundaryElements {
    public void Boundary_Elements(int mat[][]){
    // Printing Input Matrix;
        System.out.println("Input Matrix is : ");
        for(int index = 0; index < mat.length; index++) {
        for (int subIndex = 0; subIndex < mat[index].length; subIndex++) {
            System.out.print(mat[index][subIndex]);
        }
        System.out.println();
    }
    // Printing Boundary Values of Matrix
        System.out.println("Resultant Matrix is :");

        for (int index = 0; index < mat.length; index++) {
        for (int subIndex = 0; subIndex < mat[index].length; subIndex++) {

            if (index == 0 || subIndex == 0 || index == mat.length - 1
                    || subIndex == mat[index].length - 1) {
                System.out.print(mat[index][subIndex]);
            }
            else {
                // Printing Space if element
                // is not at Boundary
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args)
    {
        // Input Matrix
        int mat[][] = new int[][] { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        PrintBoundaryElements B_Values = new PrintBoundaryElements();
        B_Values.Boundary_Elements(mat);
    }
}