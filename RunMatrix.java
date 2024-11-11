import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int sizeOfMatrix;
      do{
        System.out.Println("Enter a positive number for the size of the matrix: ");
        sizeOfMatrix = input.nextInt();
      } while(sizeOfMatrix<=0);
    }
}

public static void printMatrix(int[][] matrix) {
  for(int[] row : matrix){
    for(int[] value : row){
      System.out.print(value+"\t");
    }
    System.out.Println();
  }
}
