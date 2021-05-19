public class Triangle{
    
    private float base,height;
    
    public Triangle(float b,float h){
        this.base=b;
        this.height=h;
    }
    
    public double calculateArea(){
        double a=(double)(0.5*base*height);
        return a;
    }
}