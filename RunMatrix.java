import java.util.Scanner;

public class RunMatrix {

  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int sizeOfMatrix;
      do{
        System.out.println("Enter a positive number for the size of the matrix: ");
        sizeOfMatrix = input.nextInt();
      } while(sizeOfMatrix<=0);

      int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
      System.out.println("Matrix filled with zeros: ");
      printMatrix(matrix);

      int value = 1;
      for(int row=0; row < sizeOfMatrix;row++){
        for(int colm=0; colm < sizeOfMatrix; colm++){
          matrix[row][colm] = value++;
        }
      }

      System.out.println("\n Matrix populated with values: ");
      printMatrix(matrix);

      for(int row = 0; row < sizeOfMatrix; row++){
        for(int colm = 0; colm < sizeOfMatrix - row -1; colm++){
          int inverted = matrix[row][colm];
          matrix[row][colm] = matrix[sizeOfMatrix- colm - 1][sizeOfMatrix - row -1];
          matrix[sizeOfMatrix - colm - 1][sizeOfMatrix - row - 1] = inverted;
        }
      }

      System.out.println("\n Matrix with flipped elements around the diagonal: ");
      int size = matrix.length;
      for(int row = 0; row < size; row++){
        for(int colm = 0; colm<size; colm++){
          if(row+colm ==size-1){
            System.out.print("["+ matrix[row][colm] +"]\t");
          }
          else{
            System.out.print(matrix[row][colm]+"\t");
          }
        }
        System.out.println();
      }

    }
    public static void printMatrix(int[][] matrix){

      for(int[] row : matrix){
        for(int value : row){
          System.out.print(value+"\t");
        }
        System.out.println();
      }
    }
}

