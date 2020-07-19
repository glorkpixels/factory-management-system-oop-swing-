package ManufactoringSystem;
import java.util.Hashtable;
public class carCache {
	private static Hashtable<String, Vehicles> shapeMap = new Hashtable<String, Vehicles>();
	public static Vehicles getShape(String carType) throws CloneNotSupportedException {
		Vehicles cachedVehicles = shapeMap.get(carType);
	return (Vehicles) cachedVehicles.clone();
	}
	
	public static void loadCache() {
		VehicleBus bus = new VehicleBus();
		bus.setCarType("Carrier");
		bus.setCarName("Buca Carrier");
		shapeMap.put(bus.getCarType(),bus);
		
		
		workerCar wCar = new workerCar();
		wCar.setCarType("Private Car");
		wCar.setCarName("Mehmet Uslu Private");
		shapeMap.put(wCar.getCarType(),wCar);
//		Rectangle rectangle = new Rectangle();
//		rectangle.setId("3");
//		shapeMap.put(rectangle.getId(), rectangle);
		}
		
}
