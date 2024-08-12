import java.util.Scanner;
public class sumeachcolumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //size
        double[][] matrix = new double[3][4];
        
        //input
        System.out.println("Enter a 3-by4 matrix row by row: ");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        input.close();
        for(int column = 0; column < matrix[0].length; column++){
            int total = 0;
        for(int row = 0; row < matrix.length; row++){
            total += matrix[row][column];
            
            
        }
    System.out.println("The sum of each row is "+ total);}
    }
    
}
