import java.util.Scanner;
public class ex82sumeachcolumn {
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
            double sumColumn = sumColumn(matrix,column);
            System.out.println("Sum of elements at column "+column+" is "+sumColumn); 
        }
        
    }
    public static double sumColumn(double[][] m, int columnIndex) {
       
           double total = 0;
            for(int row = 0; row < m.length; row++){
               total += m[row][columnIndex];
            }
        return total;  
         

    }
    
}


