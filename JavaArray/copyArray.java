public class copyArray {
    public static void main(String[] args) {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
        
        //copy using arraycopy
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        for(int var: targetArray ){
            System.out.println(var+" ");
        }
    }
    
}
