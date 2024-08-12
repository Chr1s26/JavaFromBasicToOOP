public class testOverLoading {
    public static void main(String[] args) {
        
    }
    
}

//Super class
class B{
    public void p(double i){
        System.out.println("class B method "+i*2);
    }
}

//Sub class
class A extends B {
    public void p(double i){
        System.out.println("Class A method "+i);
    }
}

// OverLoading means that you can have method same name same data type but different functionality