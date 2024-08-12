public class passtwodimentional {
    public static void main(String[] args) {
        int[][] array = getarray();
    System.out.println("Sum of all elements is "+sum(array));
    }
    public static int [][] getarray(){
        int[][] array = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        return array;

    }


    public static int sum(int[][] m){
        int total = 0;
        for(int row = 0; row < m.length; row ++){
           
            for(int column = 0; column < m[0].length;column++){
                total += m[row][column];
            }
        }
        return total;
    }
    
}
