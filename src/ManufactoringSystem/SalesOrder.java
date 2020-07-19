package ManufactoringSystem;

import java.util.ArrayList;
import java.util.List;

public class SalesOrder extends Order {

//	static List<SalesOrder> sellList = new ArrayList<SalesOrder>();
	
	private String location;
	
	public SalesOrder(String name, int id,String Location) {
		super(name, id);
		this.location=Location;
	}
	public SalesOrder(){
		super();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String fromWhere) {
		this.location = fromWhere;
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
	public boolean isDone() {
		// TODO Auto-generated method stub
		return super.isDone();
	}
	

}
