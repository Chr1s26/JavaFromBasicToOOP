public class Arraywithrandom {
    public static void main(String[] args) {
        double[] mylist = new double[5];

        
        System.out.println("Enter "+ mylist.length +" values");
        for  (int i = 0; i < mylist.length; i++){
            mylist[i] =Math.random()*10;
        }
        
    //     for (int i = 0; i < mylist.length; i ++){
    //     System.out.print(mylist[i] +" ");
    // }
    for(double var:mylist){
        System.out.print(var+" ");
    }
        
    }
    
}
