public class SummingElement {
    public static void main(String[] args) {
        int[][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        
            int total = 0;
            for (int row = 0; row < matrix.length; row++){
                for(int column = 0; column < matrix[0].length; column++){
                    total += matrix[row][column];
                }
            }
            System.out.println("The sum is = "+total);

        
    }
    
}
