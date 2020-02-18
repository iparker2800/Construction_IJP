/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * This is the empty argument constructor
	 */
	public Mall() {
	
	}//End of constructor

	/**
	 * This is the preferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 * @param numRentedUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	
	}//End of constructor
	
	/**
	 *This is to simulate the drawing of Mall
	 */
	public void draw() {
		System.out.println("Draw for <<Mall>>");
	
	}//End of draw
	
	/**
	 * This is the displayData
	 */
	public String displayData() {
		return "Project Name " + projectName +"\n Address: " + completeAddress +"\n Square Feet:" + totalSquareFeet + "\n Occupancy Group:" + occupancyGroup +"\n Subgroup: " + subgroup + "\n Num of RentableUnits: " + numRentableUnits
				+ "\n Number of RentedUnits:" + numRentedUnits + "\n Median Size Unit:" + medianUnitSize + "\n Number of ParkingSpaces:" + numParkingSpaces;
	
	}//End of displayData

	/**
	 *This is the numRentedUnits getter
	 * @return
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	
	}//End of RentedUnit getter

	/**
	 * This is the numRentedUnits setter
	 * @param numRentedUnits
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	
	}//End RentedUnits setter

	/**
	 * This is the medianUnitSize getter
	 * @return
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	
	}//End MedianUnitSize getter

	/**
	 * This is the medianUnitSize setter
	 * @param medianUnitSize
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	
	}//End MedianUnitSize setter

	/**
	 * This is the numParkingSpaces getter
	 * @return
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	
	}//End NumParkingSpaces getter

	/**
	 * This is the numParkingSpaces setter
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	
	}//End NumParkingSpaces setter

	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	
	}//End of toString
	
}//End Mall class
