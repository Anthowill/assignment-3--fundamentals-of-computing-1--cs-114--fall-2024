import java.util.Arrays;

public class Matrix {
  //to print just matrix without color
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.print(value + "\t");
      }
      System.out.println();
    }
  }

  //to print matrix with color yellow diagonal
  public static void printMatrixWithHighlight(int[][] matrix){
    int sizeOfMatrix = matrix.length;
    final String YELLOW = "\033[33m";
    final String RESET = "\033[0m";

    for (int row = 0; row < sizeOfMatrix; row++) {
      for (int colm = 0; colm < sizeOfMatrix; colm++) {
        if (row + colm == sizeOfMatrix - 1) {
          System.out.print(YELLOW + matrix[row][colm] + RESET + "\t");
        }
        else {
          System.out.print(matrix[row][colm] + "\t");
        }
      }
      System.out.println();
    }
  }

  //to populate matrix with number from 1 to (sizeOfMatrix * sizeOfMatrix)
  public static void populateMatrix(int[][] matrix){
    int value = 1, sizeOfMatrix = matrix.length;

    for (int row = 0; row < sizeOfMatrix; row++) {
      for (int colm = 0; colm < sizeOfMatrix; colm++) {
        matrix[row][colm] = value++;
      }
    }
  }

  //to flip the matrix across the diaganol without moving the diaganol
  public static void flipMatrixAroundDiagonal(int[][] matrix){
    int sizeOfMatrix = matrix.length;

    for (int row = 0; row < sizeOfMatrix; row++) {
      for (int colm = 0; colm < sizeOfMatrix - row - 1; colm++) {
        int inverted = matrix[row][colm];
        matrix[row][colm] = matrix[sizeOfMatrix - row - 1][sizeOfMatrix - colm - 1];
        matrix[sizeOfMatrix - row - 1][sizeOfMatrix - colm - 1] = inverted;
      }
    }
  }
}
