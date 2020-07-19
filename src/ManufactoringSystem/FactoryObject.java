package ManufactoringSystem;

public class FactoryObject {
	private static FactoryObject instance = new FactoryObject();
	//make the constructor private so that this class cannot be
	//instantiated
	private FactoryObject(){}
	//Get the only object available
	public static FactoryObject getInstance(){
	return instance;
	}
	public void showMessage(){
		System.out.println("Welcome to the FACTORY MANAGEMENT SYSTEM");
		}
}
