import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException{
        File file = new File("score.txt");
        if(file.exists()){
            System.out.println("File already exits");
            System.exit(1);
        }
        //Create a file
        PrintWriter output = new PrintWriter(file);
        //Write the formated output to the file
        output.print(" Chris ");
        output.println(90);
        output.print(" Kadd ");
        output.println(85);
        output.close();
        System.out.println("I am very hungry and boring");
        System.out.println("The file has "+file.length()+"  bytes");
        System.out.println("Can it be read?  "+file.canRead());
        System.out.println("Can it be written  "+file.canWrite());
    }
    
}
