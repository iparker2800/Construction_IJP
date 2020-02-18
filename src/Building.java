/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	/**
	 * This is the empty argument constructor
	 */
	public Building() {
		super();
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = " ";
	
	}//End of constructor
	
	/**
	 * This is the preferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	
	}//End of constructor
	
	/**
	 * This is our draw method
	 */
	public void draw() {
		System.out.println("Draw for <<Building>>");
	
	}//End of draw
	
	/**
	 * This is the displayData
	 * @return
	 */
	public String displayData() {
		return "Project Name " + projectName +"\n Address: " + completeAddress +"\n Square Feet:" + totalSquareFeet + "\n Occupancy Group:" + occupancyGroup +"\n Subgroup: " + subgroup;
	
	}//End of displayData

	/**
	 *This is projectName getter
	 * @return
	 */
	public String getProjectName() {
		return projectName;
	
	}//End projectName getter

	/**
	 * This is projectName setter
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	
	}//End projectName setter

	/**
	 * This is the completeAddress getter
	 * @return
	 */
	public String getCompleteAddress() {
		return completeAddress;
	
	}//End completeAddress getter

	/**
	 * This is the completeAddress setter
	 * @param completeAddress
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	
	}//End completeAddress setter

	/**
	 * This is the totalSquareFeet getter
	 * @return
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	
	}//End TotalSquareFeet getter
	
	/**
	 * This is the totalSquareFeet setter
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	
	}//End of totalSquareFeet setter

	/**
	 * This is the occupancyGroup getter
	 * @return
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	
	}//End OccupancyGroup getter

	/**
	 * This is the occupancyGroup setter
	 * @param occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	
	}//End OccupancyGroup setter

	/**
	 * This the subgroup getter
	 * @return
	 */
	public String getSubgroup() {
		return subgroup;
	
	}//End subgroup getter

	/**
	 * This is the subgroup setter
	 * @param subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	
	}//End subgroup setter

	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	
	}//End of toString

}//End of Building class
