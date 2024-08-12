public class Largestsum {
    public static void main(String[] args) {
        int[][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9}};

            int maxofRow = 0;
            int indexofMaxRow =0;

            for(int column = 0; column < matrix[0].length; column++){
                maxofRow += matrix[0][column];
            }

            
            for(int row = 1; row < matrix.length; row++){
                int totalofthis=0;
                for(int column = 0; column < matrix[0].length; column++){
                    totalofthis += matrix[row][column];
                }
                if (totalofthis > maxofRow){
                    maxofRow = totalofthis;
                    indexofMaxRow = row;
                }
            }
            System.out.println("Row "+ indexofMaxRow + " has the maximum sum of "+ maxofRow);
    
}}
