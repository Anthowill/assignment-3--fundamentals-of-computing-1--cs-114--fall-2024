import java.util.Arrays;

public class Matrix {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    public static void printMatrixWithHighlight(int[][] matrix){
      int size = matrix.length;
      for (int row = 0; row < size; row++) {
          for (int colm = 0; colm < size; colm++) {
              if (row + colm == size - 1) {
                  System.out.print("[" + matrix[row][colm] + "]\t");
              } else {
                  System.out.print(matrix[row][colm] + "\t");
              }
          }
          System.out.println();
      }
    }
}
