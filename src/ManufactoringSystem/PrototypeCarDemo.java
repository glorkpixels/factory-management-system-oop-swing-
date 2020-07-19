package ManufactoringSystem;

public class PrototypeCarDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		carCache.loadCache();
		
		Vehicles vehicle1 = (Vehicles) carCache.getShape("Carrier");
		System.out.println("Vehicles : " + vehicle1.getCarType() + " name: " + vehicle1.getCarName());
		Vehicles vehicle2 = (Vehicles) carCache.getShape("Private Car");
		System.out.println("Vehicles : " + vehicle2.getCarType() + " name: " + vehicle2.getCarName() );
//		Vehicles clonedShape3 = (Vehicles) ShapeCache.getShape("3");
//		System.out.println("Shape : " + clonedShape3.getType());

	}

}
