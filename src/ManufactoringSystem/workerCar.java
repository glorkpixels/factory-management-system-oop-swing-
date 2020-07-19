package ManufactoringSystem;

public class workerCar extends Vehicles {

	@Override
	void showcase() {
		System.out.println("Inside WorkerCar::showcase() method.");
	}

	public void workerCar() {
		carType = "private";
	}


	
}
