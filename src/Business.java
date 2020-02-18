/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class Business extends Building {

	protected int numRentableUnits;
	
	/**
	 * This is the empty argument constructor
	 */
	public Business() {
		super();
		numRentableUnits = 0;
	
	}//End of constructor
	
	/**
	 * This is the preferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	
	}//End of constructor
	
	/**
	 * This is the numRentableUnits getter
	 * @return
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	
	}//End of numRentableUnits getter
	
	/**
	 * This is the numRentableUnits setter
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	
	}//End of numRentableUnits setter
	
	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits +"]";
	
	}//End of toString

}//End of Business class
