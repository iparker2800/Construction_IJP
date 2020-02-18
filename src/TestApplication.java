/**
 * 
 * @author iparker
 *@version 11
 *Construction Project
 *Spring Semester/2020
 */
public class TestApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("\t\tBuilding");
		System.out.println("_______________________________________________________________________________________");
		Building BD = new Building();
		System.out.println(BD.displayData());
		
		Building Building = new Building("Kenmark", "1800 Research Dr, Louisville, KY 40299", 10000.00, "Kenmark", "Business Building");
		System.out.println("\n" + Building.displayData() + "\n");
		Building.draw();
		System.out.println();
		System.out.println("_____________________________________________________________________________________");
		
		System.out.println("\n\t\tBusiness");
		System.out.println("_____________________________________________________________________________________");
		
		new Business();		
		Business B = new Business("Local Business", "1800 Research Dr, Louisville, KY 40299", 10000.00, "Business", "Group B", 32 );
		B.setNumRentableUnits(56);
		System.out.println("\n\n" + B.getNumRentableUnits());
		System.out.println(B.toString() + "\n\n");
		System.out.println("____________________________________________________________________________________");
		
		System.out.println("\n\t\tResidential");
		System.out.println("____________________________________________________________________________________");
		
		new Residential();
		Residential R = new Residential("Residential", "1800 Research Dr, Louisville, KY 40299", 6700.47, "Residential", "Groups R-1 to R-4", 1, 2, true);
		R.setNumBathrooms(5);
		R.setNumBedrooms(6);
		R.setLaundryRoom(false);
		System.out.println("\n\n" + R.getNumBedrooms() + " " + R.getNumBathrooms() + " " + R.isLaundryRoom());
		System.out.println(R.toString() + "\n\n");
		
		System.out.println("___________________________________________________________________________________");
		
		System.out.println("\n\t\tMall");
		System.out.println("___________________________________________________________________________________");
		
		Mall no = new Mall();
		System.out.println(no.displayData());
		
		Mall M = new Mall("St.Mathews", "2001 Newburg Rd, Louisville, KY 40205", 42309.43242, "Business", "Group B",
				57, 45, 625.75, 10000);
		System.out.println("\n" + M.displayData() + "\n");
		M.draw();
		M.setNumRentedUnits(15);
		M.setMedianUnitSize(75.34);
		M.setNumParkingSpaces(10000);
		System.out.println("\n" + M.getNumRentedUnits() + " " + M.getMedianUnitSize() + " " + M.getNumParkingSpaces());
		System.out.println(M.toString());
		System.out.println("___________________________________________________________________________________");
		
		System.out.println("\n\t\tApartment");
		System.out.println("___________________________________________________________________________________");
		
		Apartment vacant = new Apartment();
		System.out.println(vacant.displayData());
		
		Apartment A = new Apartment("Pleasant Oaks", "1800 Research Dr, Louisville, KY 40299", 7000.565, "Residential", "R3", 1, 1, false, 15, 150.45, true);
		System.out.println("\n" + A.displayData() + "\n");
		
		A.draw();
		A.setNumRentableUnits(25);
		A.setAvgUnitSize(125.65);
		A.setParkingAvailable(false);
		System.out.println("\n" + A.getNumRentableUnits() + " " + A.getAvgUnitSize() + " " + A.isParkingAvailable());
		System.out.println(A.toString());
		System.out.println("__________________________________________________________________________________");
		
		System.out.println("\n\t\tSingleFamilyHome");
		System.out.println("__________________________________________________________________________________");
		
		SingleFamilyHome devoided = new SingleFamilyHome();
		System.out.println(devoided.displayData());
		
		SingleFamilyHome SF = new SingleFamilyHome("Hill House", "1800 Research Dr, Louisville, KY 40299", 2540, "Residential", "R1", 4, 3, true, true);
		System.out.println("\n" + SF.displayData() + "\n");
		
		SF.draw();
		
		
		System.out.println(SF.toString());
		System.out.println("__________________________________________________________________________________");
		
		BD.setCompleteAddress("1800 Research Dr, Louisville, KY 40299");
		System.out.println(BD.getCompleteAddress());
		BD.setTotalSquareFeet(45.0);
		System.out.println(BD.getTotalSquareFeet());
		BD.setOccupancyGroup("Resident");
		System.out.println(BD.getOccupancyGroup());
		BD.setSubgroup("4D");
		System.out.println(BD.getSubgroup());
		
		B.setNumRentableUnits(56);
		System.out.println(B.getNumRentableUnits());
		
		R.setNumBathrooms(4);
		System.out.println(R.getNumBathrooms());
		R.setNumBedrooms(5);
		System.out.println(R.getNumBedrooms());
		R.setLaundryRoom(true);
		System.out.println(R.isLaundryRoom());
		
		M.setNumRentedUnits(45);
		System.out.println(M.getNumRentedUnits());
		M.setMedianUnitSize(456.0);
		System.out.println(M.getMedianUnitSize());
		M.setNumParkingSpaces(456);
		System.out.println(M.getNumParkingSpaces());
		
		A.setAvgUnitSize(325.0);
		System.out.println(A.getAvgUnitSize());
		A.setNumRentableUnits(32);
		System.out.println(A.getNumRentableUnits());
		A.setParkingAvailable(false);
		System.out.println(A.isParkingAvailable());
		
		SF.setGarage(true);
		System.out.println(SF.isGarage());
		
	}//end main

}//end class