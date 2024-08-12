public class ex84ShuffleRow {
    public static void main(String[] args) {
        int[][] matrix ={{1,2},
                         {3,4},
                         {5,6},
                         {7,8},
                         {9,10}};
        shuffle(matrix);
    }
    public static void shuffle(int[][] m){
        for (int row = 0; row < m.length; row++ ){
            
            int i1 = (int)(Math.random()*m.length);

            int[] temp = m[row];
            m[row] = m[i1];
            m[i1] = temp;

        }
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[0].length; column++){
                System.out.print(m[row][column]+"  ");


            }System.out.println();
        }


    }
    
}

    
