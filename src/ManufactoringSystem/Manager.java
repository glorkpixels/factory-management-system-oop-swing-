package ManufactoringSystem;
import java.util.*;

public class Manager extends Person {
	
	static Scanner scan=new Scanner(System.in);
	static List<SalesOrder> sellList = new ArrayList<SalesOrder>();
	static List<PurchaseOrder> purchaseList = new ArrayList<PurchaseOrder>();
	static int orderID=1;
	static List<Plan> planList=new ArrayList<Plan>();
	static int planID=1;
//	static SalesOrder sale = new SalesOrder();
//	static PurchaseOrder purchase=new PurchaseOrder();

	public Manager(String name, int id, String position) {
		super(name, 1000+id, position);
	}
	public Manager(){
		
	}
	public static void addOrder(int selection) {
		if(selection==1){
		System.out.print("Purchase name: ");
		String purchaseName=scan.next();
		System.out.print("From: ");
		String fromWhere=scan.next();
		purchaseList.add(new PurchaseOrder(purchaseName,orderID,fromWhere));
		orderID++;
		System.out.println("Order added. (purchase)");
			
		}
		else if(selection==2){
		System.out.print("Sell name: ");
		String saleName=scan.next();
		System.out.print("Location: ");
		String location=scan.next();
		sellList.add(new SalesOrder(saleName,orderID,location));
		orderID++;
		System.out.println("Order added. (sale)");
		}
		
		
			
	}
	public static void viewOrder() {
		System.out.println("Index\tSName\tID number\tAddress");
		for (int i = 0; i <sellList.size(); i++) {
			System.out.println(i+"\t"+sellList.get(i).getName()+"\t"+sellList.get(i).getId()+"\t"+sellList.get(i).getLocation());
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Index\tPName\tID number\tAddress");
		for (int i = 0; i < purchaseList.size(); i++) {
			System.out.println(i+".\t"+purchaseList.get(i).getName()+"\t"+purchaseList.get(i).getId()+"\t"+purchaseList.get(i).getFromWhere());
		}
		
	}
	public static void orginizeOrder() {
		viewOrder();
		System.out.print("Orginize purchase(1) orders or sell(2) order: ");
		int selection_which=scan.nextInt();
		System.out.print("Enter index of order: ");
		int index_order=scan.nextInt();
		System.out.println("1- Delete order.\n2-Change name\n3-Chance address informations");
		int select_operation=scan.nextInt();
		if(selection_which==1){
			if(select_operation==1){
				purchaseList.remove(index_order);
			}
			else if(select_operation==2){
				System.out.println("Current name: "+purchaseList.get(index_order).getName());
				System.out.print("New name: ");
				String new_name_p=scan.next();
				purchaseList.get(index_order).setName(new_name_p);
			}
			else if(select_operation==3){
				System.out.println("Current purchase address: "+purchaseList.get(index_order).getFromWhere());
				System.out.print("New address: ");
				String new_address_p=scan.next();
				purchaseList.get(index_order).setFromWhere(new_address_p);
				
			}
			
		}
		else if(selection_which==2){
			if(select_operation==1){
				sellList.remove(index_order);
			}
			else if(select_operation==2){
				System.out.println("Current name: "+sellList.get(index_order).getName());
				System.out.print("New name: ");
				String new_name_s=scan.next();
				sellList.get(index_order).setName(new_name_s);
			}
			else if(select_operation==3){
				System.out.println("Current sell address: "+sellList.get(index_order).getLocation());
				System.out.print("New address: ");
				String new_address_s=scan.next();
				sellList.get(index_order).setLocation(new_address_s);;
				
			}
		}
	}
	public static void addPlan() {
		System.out.print("Name: ");
		String plan_name=scan.next();
		System.out.println("Type: ");
		String type=scan.next();
		
		planList.add(new Plan(plan_name, planID, type));
		planID++;
	}
	public static void viewPlan() {
		System.out.println("Index\tName\tID number\tContent");
		for (int i = 0; i <planList.size(); i++) {
			System.out.println(i+"\t"+planList.get(i).getName()+"\t"+planList.get(i).getId()+"\t"+planList.get(i).getContent());
		}
		
	}
	public static void orginizePlan() {
		
		viewPlan();
		System.out.print("Please select the id to organize: ");
		int selectID = scan.nextInt();
		System.out.println("1-To add type and content");
		System.out.println("2-Change the plan siutation (True/False)");
		System.out.print("Enter your selection: ");
		int selectionOrganize = scan.nextInt();
		if(selectionOrganize==1){
			System.out.print("Enter content: ");
			String content = scan.next();
			System.out.print("Enter type: ");
			String type = scan.next();
			planList.get(selectID).setContent(content);
			planList.get(selectID).setContent(type);
			System.out.println("Content: "+ content+ "and Type: "+ type + "are added.");
		}
		else if(selectionOrganize==2){
			System.out.println("If plan is on work it is TRUE");
			System.out.println("If plan is not work/aborted it is FALSE");
			System.out.print("1- TRUE , 2- FALSE . Choose");
			int iscurrent = scan.nextInt();
			if(iscurrent ==1){
				planList.get(selectID).setCurrent(true);
			}
			else if(iscurrent==2){
				planList.get(selectID).setCurrent(false);
			}
			
		}
		
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
		
		//if enter leave time are added update this part by using those
		
	}

	@Override
	void calculateSalary() {
		// basicly 4*calculateWorkingHours();
		
		
	}

	

}
