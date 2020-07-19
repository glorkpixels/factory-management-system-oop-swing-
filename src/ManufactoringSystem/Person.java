package ManufactoringSystem;

public abstract class Person {

	
	private String name;
	private int id;
	private String position;
	private String entertime;
	private String leavetime;
	
	public Person(String name, int id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
		
	}
	public Person(){
		
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	abstract void calculateWorkingHours();
	abstract void calculateSalary();

	public String getEntertime() {
		return entertime;
	}
	public String getLeavetime() {
		return leavetime;
	}
	public void setEntertime(String entertime) {
		this.entertime = entertime;
	}
	public void setLeavetime(String leavetime) {
		this.leavetime = leavetime;
	}
		
}
