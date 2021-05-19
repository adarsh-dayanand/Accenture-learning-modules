
public class Project {
	
	private String projectId; 
	private String projectName;
	private float projectCost;
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(float projectCost) {
		this.projectCost = projectCost;
	}
	public Project(){
	    projectId=null;
	    projectName=null;
	    projectCost=0;
	}
}
