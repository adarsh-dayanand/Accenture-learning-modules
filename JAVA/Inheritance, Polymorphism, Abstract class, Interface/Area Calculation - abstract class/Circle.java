import java.lang.Math;

public class Circle extends Shape{
    private float radius;
    
    public Circle(float radius){
        this.radius=radius;
    }
    
    public double calculateArea(){
        double a=(double)radius*radius*Math.PI;
        return a;
    }
}