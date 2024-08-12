

public class ex81computeweeklyhours {
    public static void main(String[] args) {
        int[][] array = {{2,4,3,4,5,8,8},
                         {7,3,4,3,3,4,4},
                         {3,3,4,3,3,2,2},
                         {9,3,4,7,3,4,1},
                         {3,5,4,3,6,3,8},
                         {3,4,4,6,3,4,4},
                         {3,7,4,8,3,8,4},
                         {6,3,5,9,2,7,9}};
        
        

        int[] total = new int[8] ;
        for(int row = 0; row < array.length ; row++){
            for(int column = 0; column < array[0].length; column++){
                total[row] += array[row][column];
            }
            System.out.println("Employee " +row+ "salary is "+total[row]);
        }

        for(int i =0; i<8;i++){
            for(int j =i+1;j<8;j++){
                if(total[i]<total[j]){
                    int temp = total[i];
                    total[i]=total[j];
                    total[j]=temp;
                }
            }
        }
    
         for(int i =0;i<total.length;i++){
            int len = total.length-1-i;
            System.out.println("Employee "+len+" salary is "+total[i]);
         }
        }
    
}
