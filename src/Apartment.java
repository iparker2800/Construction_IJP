/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class Apartment extends Residential {
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 *This is the empty argument constructor
	 */
	public Apartment() {
		
	}//End of Constructor
 
	/**
	 * This is the preferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param LaundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean LaundryRoom,
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, LaundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	
	}//End of constructors
	
	/**
	 * This is supposed to simulate drawing of Residential
	 */
	public void draw() {
		System.out.println("Draw for <<Residential>>");
	
	}//End of Draw
	
	/**
	 * This is displayData
	 */
	public String displayData() {
		
		char L;
		char P;
		
		if(LaundryRoom == true)
			L = 'Y';
		else
			L= 'N';
		if(parkingAvailable == true)
			P = 'Y';
		else
			P = 'N';
		
		return "Project Name " + projectName +"\n Address: " + completeAddress +"\n Square Feet:" + totalSquareFeet + "\n Occupancy Group:" + occupancyGroup +"\n Subgroup: " + subgroup + "\n Num of Bedrooms: " + numBedrooms
				+ "\n Number of Bathrooms:" + numBathrooms + "\n LaundryRoom:" + L + "\n Number of RentableUnits:" + numRentableUnits + "\n Average UnitSize:" + avgUnitSize + "\n Parking Available:" + P;
		
	}//End of displayData

	/**
	 * This is numRentableUnits getter
	 * @return
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	
	}//End of NumRentableUnits getter

	/**
	 * This is numRentableUnits setter
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	
	}//End of numRentableUnits setter

	/**
	 * This is the avgUnitSize getter
	 * @return
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	
	}//End of AvgUnitSize getter

	/**
	 * This is the avgUnitSize setter
	 * @param avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	
	}//End of avgUnitSize setter

	/**
	 *This is the parkingAvailable getter
	 * @return
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	
	}//End of parkingAvailable getter

	/**
	 *This is the parkingAvailable setter
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	
	}//End of parkingAvailable setter

	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	
	}//End of toString

}//End of Apartment class


