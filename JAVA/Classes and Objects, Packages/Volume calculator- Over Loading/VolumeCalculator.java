public class VolumeCalculator{
    
    public double calculateVolume(double radius,double height)
    {
        double volume;
        volume=(3.14)*radius*radius*height;
        double answer=Math.round(volume*100.0)/100.0;
        return answer;
    }
    
    public double calculateVolume(int length,int breadth, int height)
    {
        double cuboid;
        cuboid=length*breadth*height;
        double answer1=Math.round(cuboid*100.0)/100.0;
        return answer1;
    }
}