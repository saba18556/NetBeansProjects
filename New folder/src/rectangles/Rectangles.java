
package rectangles;

class rectangle{
    
    double width;
    double height;
    
    rectangle(){
        width = 1.0;
        height = 1.0;
    }
    
    rectangle(double width, double height){
         
        this.width = width;
        this.height = height;
        
    }
    
    public double getArea(){
        double Area;
        Area = width*height;
        return Area;
    }
    
    public double getPerimeter(){
        double perimeter;
        perimeter = 2*(width+height);
        return perimeter;
    }
    
    public void display(){
        System.out.println("Height: " + height + " Width: " + width);
    }
    
    
}
public class Rectangles {

    public static void main(String[] args) {
        
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(2.0,3.5);
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        r1.display();
        r2.display();
    }
    
}
