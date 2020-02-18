/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class Residential extends Building {

	protected int numBathrooms;
	protected int numBedrooms;
	protected boolean LaundryRoom;
	
	/**
	 * This is the empty argument constructor
	 */
	public Residential() {
		
	}//End of constructor
	/**
	 * This is the preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param LaundryRoom
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean LaundryRoom) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBathrooms = numBathrooms;
		this.numBedrooms = numBedrooms;
		this.LaundryRoom = LaundryRoom;
	
	}//End of constructor

	/**
	 * Getter of NumBathrooms
	 * @return
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	
	}//End of numBathrooms getter

	/**
	 * Setter of NumBathrooms
	 * @param numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	
	}//End of NumBathrooms setter

	/**
	 * Getter of NumBedrooms
	 * @return
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	
	}//End of numBedrooms getter

	/**
	 * Setter of numBedrooms
	 * @param numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	
	}//End of numBedrooms setter
	
	/**
	 * Getter of LaundryRoom
	 * @return
	 */
	public boolean isLaundryRoom() {
		return LaundryRoom;
	
	}//End of LaundryRoom is
	
	/**
	 * Setter of LaundryRoom
	 * @param laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		LaundryRoom = laundryRoom;
	
	}//End of LaundryRoom setter
	
	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", LaundryRoom="
				+ LaundryRoom + "]";
	
	}//End toString

}//End of Residential class
