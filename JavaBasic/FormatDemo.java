public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s","Degrees","Radians","Sine","Cosine","Tangent");

        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("\n%-10d%-10.4f%-10.4f%-10.4f%-10.4f",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));

        int degrees1 = 60;
        double radians1 = Math.toRadians(degrees1);
        System.out.printf("\n%-10d%-10.4f%-10.4f%-10.4f%-10.4f",degrees1,radians1,Math.sin(radians1),Math.cos(radians1),Math.tan(radians1));
    }
    
}
