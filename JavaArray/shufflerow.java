public class shufflerow {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int row = 0; row < array.length; row++){
               int i1 = (int)(Math.random()*array.length);
               
               int[] temp = array[row];
               array[row] = array[i1];
               array[i1] = temp;
        }
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column< array[0].length; column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
        
    }
    
}
