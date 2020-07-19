package ManufactoringSystem;

public abstract class Vehicles implements Cloneable {
	private String carName;
	private String carLicenceplate;
	private String model;
	protected String carType;
	
	
	
	
	abstract void showcase();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
		clone = super.clone();
		} catch (CloneNotSupportedException e) {
		e.printStackTrace();
		}
		return clone;
	}
	public String getCarName() {
		return carName;
	}
	public String getCarLicenceplate() {
		return carLicenceplate;
	}
	public String getModel() {
		return model;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setCarLicenceplate(String carLicenceplate) {
		this.carLicenceplate = carLicenceplate;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
	
	
	
	
}
