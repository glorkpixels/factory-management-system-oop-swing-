package ManufactoringSystem;

import java.util.*;

public class Storage {
	private String name;
	private String type;
	private int id;
	private int amount;
	private int maxStorageLimit;
	private int minNeedLimit;
	
	static int productID=1;
	static List<Product> productList = new ArrayList<Product>();
	static DynamicQueue productHISTORY = new DynamicQueue();
	
	public Storage(String name, String type, int id) {
		this.name = name;
		this.type = type;
		this.id = id;
	}
	
	public Storage(){
		
	}
	public void showStorageInfo(){
		if(productList.size()==0){
			System.err.println("There is not any producement.");
		}
		else{
			System.out.println("ID\tName\tType\tProduce Speed");
			for (int i = 0; i < productList.size(); i++) {
				System.out.println(i+"\t"+productList.get(i).getName()+"\t"+productList.get(i).getId()+"\t"+productList.get(i).getType()+"\t"+productList.get(i).getSpeed());
				}
			System.out.println("------------------------");
			}
	}
	public void removeProduct(int id){
		productList.remove(id);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMaxStorageLimit() {
		return maxStorageLimit;
	}

	public void setMaxStorageLimit(int maxStorageLimit) {
		this.maxStorageLimit = maxStorageLimit;
	}

	public int getMinNeedLimit() {
		return minNeedLimit;
	}

	public void setMinNeedLimit(int minNeedLimit) {
		this.minNeedLimit = minNeedLimit;
	}
	public boolean isFull() {
		if(amount==maxStorageLimit)
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(amount==0)
			return true;
		else
			return false;
	}
	public boolean isSufficient() {
		if(amount>=minNeedLimit)
			return true;
		else
			return false;
	}
	
	
}
