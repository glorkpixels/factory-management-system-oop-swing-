package ManufactoringSystem;

public class Product {
	private String name;
	private int id;
	private String type;
	private String speed="||";
	
	public Product(String name, int id, String type) {
		this.name = name;
		this.id = id;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpeed(){
		return speed;
	}
	public void setSpeed(String speed){
		this.speed = speed;
	}

}
