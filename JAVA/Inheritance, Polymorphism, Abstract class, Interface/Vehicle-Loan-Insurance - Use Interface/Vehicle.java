
public class Vehicle implements Loan,Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public double issueLoan(){
	    double loan=0;
	    if(vehicleType.equalsIgnoreCase("4 wheeler")){
	        loan=0.8*price;
	    }
	    else if(vehicleType.equalsIgnoreCase("3 wheeler")){
	        loan=0.75*price;
	    }
	    else if(vehicleType.equalsIgnoreCase("2 wheeler")){
	        loan=0.5*price;
	    }
	    return loan;
	}
	
	public double takeInsurance(){
	    double amt=0;
	    if(price<=150000)
	        amt=3500;
	    else if(price>150000 && price<=300000)
	        amt=4000;
	    else if(price>300000)
	        amt=5000;
	    return amt;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}

}