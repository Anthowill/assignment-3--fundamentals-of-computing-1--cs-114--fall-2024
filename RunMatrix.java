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
        Matrix.printMatrix(matrix); // Use the method from MatrixUtils

        int value = 1;
        for (int row = 0; row < sizeOfMatrix; row++) {
            for (int colm = 0; colm < sizeOfMatrix; colm++) {
                matrix[row][colm] = value++;
            }
        }

        System.out.println("\nMatrix populated with values: ");
        Matrix.printMatrix(matrix); // Use the method from MatrixUtils

        for (int row = 0; row < sizeOfMatrix; row++) {
            for (int colm = 0; colm < sizeOfMatrix - row - 1; colm++) {
                int inverted = matrix[row][colm];
                matrix[row][colm] = matrix[sizeOfMatrix - colm - 1][sizeOfMatrix - row - 1];
                matrix[sizeOfMatrix - colm - 1][sizeOfMatrix - row - 1] = inverted;
            }
        }

        System.out.println("\nMatrix with flipped elements around the diagonal: ");
        Matrix.printMatrixWithHighlight(matrix);
    }
}
