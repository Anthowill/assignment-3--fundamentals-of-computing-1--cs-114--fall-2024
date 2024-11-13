import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfMatrix;

        do {
            System.out.println("Enter a positive number for the size of the matrix: ");
            sizeOfMatrix = input.nextInt();
        } while (sizeOfMatrix <= 0);

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        System.out.println("Matrix filled with zeros: ");
        Matrix.printMatrixWithHighlight(matrix);

        System.out.println("\nMatrix populated with values: ");
        Matrix.populateMatrix(matrix);
        Matrix.printMatrixWithHighlight(matrix);

        System.out.println("\nMatrix with flipped elements around the diagonal: ");
        Matrix.flipMatrixAroundDiagonal(matrix);
        Matrix.printMatrixWithHighlight(matrix);

        input.close();
    }
}
