package ManufactoringSystem;

public abstract class Order {
	
	String name;
	int id;
	boolean done;
	public Order(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Order(){
		
	}
	public static void operation() {}
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
	public boolean isDone() {
		return done;
	}

}
