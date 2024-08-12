import java.util.Scanner;
public class Arrayinputvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter values in "+matrix.length+ " rows and "+ matrix[0].length + " columns :");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                matrix [row][column] = input.nextInt();
            }
        }
        input.close();
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }

        System.out.println(matrix[1][1]);
        System.out.println(matrix[0][0]);
        
    }
    
}
