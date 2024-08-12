import java.util.Scanner;
public class ex83LargestRowAndColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //size
        int[][] matrix = new int[4][4];

        //input
        System.out.println("Enter your matrix ");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column< matrix[0].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        input.close();
        int maxofrow = 0;
        int maxofcolumn =0;
        int indexofrow =0 ;
        int indexofcolumn=0 ;

        for(int column = 0; column< matrix[0].length; column++){
         maxofrow = matrix[0][column];
         }

        for(int row = 0; row < matrix.length; row++){
             maxofcolumn = matrix[row][0];
             
        }


        for(int row = 1; row < matrix.length; row++){
            int total = 0;
            for(int column = 0; column< matrix[0].length; column++){
                total += matrix[row][column];
            }
            if (total > maxofrow){
                maxofrow = total;
                indexofrow = row;

            }
        }
        for(int column = 1; column< matrix[0].length; column++){
            int total = 0;
            for(int row = 0; row < matrix.length; row++){
                total += matrix[row][column];
            }
            if (total > maxofcolumn){
                maxofcolumn = total;
                indexofcolumn = column;

            }
        }
        System.out.println("the largest row index "+indexofrow);
        System.out.println("the largest column index "+indexofcolumn);
        
    }
    
}
