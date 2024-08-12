public class twodimenarray {
    public static void main(String[] args) {
        int[][] array = getarray();
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[0].length; column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
        System.out.println("Max of row is "+findlargestrow(array));
        System.out.println("Max of column is "+findlargestcolumn(array));
        saythanku();
       
    }



    public static int[][] getarray(){
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       return matrix;
    }



    public static int findlargestrow(int[][] array1){
        
        int maxOfRow = 0;
        for(int column = 0; column < array1[0].length; column++){
            maxOfRow += array1[0][column];
        }

        for(int row = 1; row < array1.length; row++){
            int total = 0;
            for(int column = 0; column < array1[0].length; column++){
                total += array1[row][column];
            }
            if(total > maxOfRow){
                int temp = maxOfRow;
                maxOfRow = total;
            }
        }
        return maxOfRow;
    }


    public static int findlargestcolumn(int[][] array2){
        
        int maxofcolumn = 0;
        for(int row = 0; row < array2.length; row++){
           maxofcolumn += array2[row][0];
        }

        for(int column = 1; column < array2[0].length; column++){
            int total = 0;
            for(int row= 0; row < array2.length; row++){
                total += array2[row][column];
            }
            if(total > maxofcolumn){
                int temp = maxofcolumn;
                maxofcolumn = total;
            }
        }
        return maxofcolumn;
    }

    public static void saythanku(){
        System.out.println("Thank u ");
    }
    
}
