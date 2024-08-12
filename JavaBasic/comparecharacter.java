public class comparecharacter {
    public static void main(String[] args) {
        char ch = '4';
        if (ch>='A'  && ch<='Z'){
System.out.println(ch+"up");
        }
        else if (ch >= 'a' && ch< 'z'){
            System.out.println(ch+"low");
        }
        else if(ch>= '0' && ch<'9'){
            System.out.println(ch+"num");
        }
    }
    
}
