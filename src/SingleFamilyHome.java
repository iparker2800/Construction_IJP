/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	/**
	 * This is the empty argument constructor
	 */
	public SingleFamilyHome() {
	
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
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean LaundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, LaundryRoom);
		this.garage = garage;
	
	}// End of Constructor
	
	/**
	 * This is draw
	 */
	public void draw() {
		System.out.println("Draw for <<SingleFamilyHome>>");
	
	}//End of draw

	/**
	 * This is the displayData
	 */
	public String displayData() {
		
		char L;
		char G;
		
		if(LaundryRoom == true)
			L = 'Y';
		else
			L = 'N';
		if(garage == true)
			G = 'Y';
		else
			G = 'N';
		
		return "Project Name " + projectName +"\n Address: " + completeAddress +"\n Square Feet:" + totalSquareFeet + "\n Occupancy Group:" + occupancyGroup +"\n Subgroup: " + subgroup + "\n Num of Bedrooms: " + numBedrooms
		+ "\n Number of Bathrooms:" + numBathrooms + "\n LaundryRoom:" + L + "\n garage: " + G;
	
	}//End of displayData

	/**
	 * This is the garage getter
	 * @return
	 */
	public boolean isGarage() {
		return garage;
	
	}//End of garage getter

	/**
	 * This is the garage setter
	 * @param garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	
	}//End of garage setter

	/**
	 * This is the toString
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	
	}//End of toString
	
	
	
	
	













}
