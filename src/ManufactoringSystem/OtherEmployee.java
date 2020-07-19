package ManufactoringSystem;

public class OtherEmployee extends Person{

	public OtherEmployee(String name, int id, String position) {
		super(name,4000+ id, position);
		// TODO Auto-generated constructor stub
	}
	
	public OtherEmployee(){
		super();
	}
	
	public static void viewMalfunction() {
		
	}
	public static void viewVehicle() {
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	


	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}



	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}



	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}



	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return super.getPosition();
	}



	@Override
	public void setPosition(String position) {
		// TODO Auto-generated method stub
		super.setPosition(position);
	}

	@Override
	void calculateWorkingHours() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

	
	

}
