public class ArrayLargestElement {
    public static void main(String[] args) {
        float[] mylist = new float[5];

for(int i = 0; i < mylist.length; i++){
    mylist[i]=(float) Math.random()*10;
}

for(int i = 0; i < mylist.length; i++){
    System.out.print(mylist[i]+" ");}

//find largest number
float max = mylist[0];
int indexofMax = 0;

for (int i = 1 ; i < mylist.length; i ++){
    if (mylist[i]>max){
        max = mylist[i];
        indexofMax=i;
    }
}
System.out.println("\n"+max);
System.out.println("index of max values is "+indexofMax);
       


       
    }
    
    
}



