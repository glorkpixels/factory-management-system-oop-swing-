package ManufactoringSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engineer extends Person {
	static Scanner scan=new Scanner(System.in);
	static List<Machine> machineList = new ArrayList<Machine>();
	static int machineID=0;
	static List<Storage> storageList = new ArrayList<Storage>();
	static int storageID=0;
	static Manager tempMan=new Manager();
	
		
	
	public Engineer(String name, int id, String position) {
		super(name, 2000+id, position);
		
	}
	
	public Engineer(){
		super();
	}
	
	public static void addPlan() {
		tempMan.addPlan();
	}
	public static void addMachine() {
		System.out.print("Name: ");
		String name_machine=scan.next();
		System.out.print("Type: ");
		String type_machine=scan.next();
		machineList.add(new Machine(name_machine, machineID, type_machine));
		machineID++;
	}
	public static void viewStorage() {
		System.out.println("Index\tName\tID number");
		for (int i = 0; i <storageList.size(); i++) {
			System.out.println(i+"\t"+storageList.get(i).getName()+"\t"+storageList.get(i).getId());
		}
	}
	public static void viewPlan() {
		tempMan.viewPlan();
	}
	

	public static void viewOrder() {
		tempMan.viewOrder();
	}
	public static void viewMachine() {
		System.out.println("Index\tName\tID number");
		for (int i = 0; i <machineList.size(); i++) {
			System.out.println(i+"\t"+machineList.get(i).getName()+"\t"+machineList.get(i).getId());
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
		//when enter leave is done, it will be done
		
	}

	@Override
	void calculateSalary() {
		//when enter leave...
		
	}

	
	
	
	

}
