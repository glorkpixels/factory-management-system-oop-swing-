package ManufactoringSystem;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder extends Order{
//	static List<PurchaseOrder> purchaseList = new ArrayList<PurchaseOrder>();
	
	private String fromWhere;
	
	public PurchaseOrder(String name, int id,String fromWhere) {
		super(name, id);
		this.fromWhere=fromWhere;
	}
	public PurchaseOrder(){
		super();
		
	}

	public String getFromWhere() {
		return fromWhere;
	}

	public void setFromWhere(String fromWhere) {
		this.fromWhere = fromWhere;
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
