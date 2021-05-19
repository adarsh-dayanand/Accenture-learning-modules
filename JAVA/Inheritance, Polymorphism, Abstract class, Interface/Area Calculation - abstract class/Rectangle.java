public class Rectangle extends Shape{
    
    private float length,breadth;
    public Rectangle(float l,float b){
        this.length=l;
        this.breadth=b;
    }
    
    public double calculateArea(){
        double a=(double)(length*breadth);
        return a;
    }
}