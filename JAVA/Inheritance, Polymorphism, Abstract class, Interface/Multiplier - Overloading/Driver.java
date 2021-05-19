public class Driver{
    
    public static void main(String[] args){
        
        //create the object of Multiplier and invoke the overloaded methods 
        Multiplier M=new Multiplier();
        System.out.println(M.multiply(2,3));
        System.out.println(M.multiply(2,3,4));
        System.out.println(M.multiply(2.5,3.5));
        
        
    }
    
}