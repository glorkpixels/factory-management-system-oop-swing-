package ManufactoringSystem;

public class VehicleBus  extends Vehicles{

	@Override
	void showcase() {

		System.out.println("Inside VehicleBus::showcase() method.");
	}
	
	public VehicleBus() {
		carType = "Personal Carrier";	
	}

}
