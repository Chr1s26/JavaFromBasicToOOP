import java.util.*;
public class StringMethod {
    public static void main(String[] args) {
       /* String message = "Welcome to Java";
        System.out.println("The length of" + message + " is "+message.length());
        System.out.println("The first character of the message is "+message.charAt(0));
        System.out.println("The message is in Uppercase:"+ message.toUpperCase());
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
     System.out.print(name.toUpperCase());
        String emailDB = "htetkyawswarlinn44@gmail.com";
        String emailIN = "HtetKyawswarLinn44@gmail.com";
        System.out.println(emailDB.compareTo(emailIN));
        System.out.println(emailDB.compareToIgnoreCase(emailIN));*/
      String message = "Welcome to Java";
     message = message.substring(0,11) + "HTML";
     System.out.println(message);
     System.out.println("Welcome to java".indexOf("j"));
     System.out.println("Welcome to java".indexOf("j",3)); //what is difference with cahrat?
     //}
    /*String FullName = "Chris Kadd";
    int index = FullName.indexOf(" ");
    String FirstName = FullName.substring(0,index);
    System.out.println(FirstName);
    String LastName = FullName.substring(index+1);
    System.out.println(LastName);*/
    }
}
