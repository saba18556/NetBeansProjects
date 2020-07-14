
package points;

class point{
    
    public double px;
    public double py;
    
    point(){
        px=0;
        py=0;
    }
    
    point(double px, double py){
        this.px = px;
        this.py = py;
    }
    
    public double getDifference(double Px1, double Px2, double Py1, double Py2){
        double d = 0.0;
        d = Math.sqrt((Math.pow((Px2-Px1),2))+(Math.pow((Py2-Py1),2)));
        return d;
    }
    
}
public class Points {

    public static void main(String[] args) {
        point p1 = new point(2,2);
        point p2 = new point(2,2);
        System.out.println(p1.getDifference(2,2,2,2));
    }
    
}
