
public class InternalProject extends Project {//fill the code 
	private String deptCode;
	
	private int noOfResource;

	private float costPerResource;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public int getNoOfResource() {
		return noOfResource;
	}

	public void setNoOfResource(int noOfResource) {
		this.noOfResource = noOfResource;
	}

	public float getCostPerResource() {
		return costPerResource;
	}

	public void setCostPerResource(float costPerResource) {
		this.costPerResource = costPerResource;
	}
	
	//Fill the code
	public InternalProject(){
	    deptCode=null;
	    noOfResource=0;
	    costPerResource=0;
	}
	public void calculateCostDetails(){
	    setProjectCost(noOfResource*costPerResource);
	}

}
