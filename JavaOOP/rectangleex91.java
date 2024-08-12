public class rectangleex91 {
    double width;
    double height;

    rectangleex91(){

    }
    rectangleex91(double newwidth, double newheight){
        width = newwidth;
        height = newheight;
    }

    double getarea(){
        return width * height;
    }

    double getPerimeter(){
        return (width + height) * 2;
    }
}
