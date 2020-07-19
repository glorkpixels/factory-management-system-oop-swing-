package ManufactoringSystem;
import java.text.SimpleDateFormat;
import java.util.*;

	

public class test {
	
	static int id_eng=0, id_man=0, id_work=0, id_emp = 0;
	
	static Scanner scan = new Scanner(System.in);
	static List<Engineer> engineerList = new ArrayList<Engineer>();
	static List<Manager> managerList = new ArrayList<Manager>();
	static List<Worker> workerList = new ArrayList<Worker>();
	static List<OtherEmployee> employeeList = new ArrayList<OtherEmployee>();
	static boolean exit_flag=true;
	static boolean exit_flag_manager=true;
	static boolean exit_flag_engineer=true;
	static boolean exit_flag_worker=true;
	static boolean exit_flag_employee=true;
	static boolean exit_flag_admin=true;
	static boolean exit_flag_storage=true;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		while(exit_flag){
			System.out.println("--------Manufactoring Employee Program----------------");
			FactoryObject object = FactoryObject.getInstance();
			//show the message
			object.showMessage();
			makeItTrue();
			menu();	
			System.out.println("-----------------------------------------");
		}
		
	}
	public static void makeItTrue(){
		exit_flag=true;
		exit_flag_manager=true;
		exit_flag_engineer=true;
		exit_flag_worker=true;
		exit_flag_employee=true;
		exit_flag_admin=true;
		
	}
	
	public static void menu() throws CloneNotSupportedException{
	
		System.out.println("Please select your position");
		System.out.println("1-Manager");
		System.out.println("2-Engineer");
		System.out.println("3-Worker");
		System.out.println("4-Other employees");
		System.out.println("5-Show storage and product manufactoring. ");
		System.out.println("6-Exit");
		
		System.out.print("Selection: ");
		int selection = scan.nextInt();
		
		
		if(selection==1){
			System.out.print("Enter manager's password: ");
			String man_pass = scan.next();
			if(man_pass.equals("manager1234")){
				while(exit_flag_manager)
					menuForManager();
			}
		}
		else if(selection==2){
			System.out.print("Enter engineer's password:");
			String eng_pass = scan.next();
			if(eng_pass.equals("engineer1234")){
				while(exit_flag_engineer)
					menuForEngineer();
			}
		}
		else if(selection==3){
			System.out.print("Enter worker's password: ");
			String work_pass = scan.next();
			if(work_pass.equals("worker1234")){
				while(exit_flag_worker)
					menuForWorker();
			}
		}
		else if(selection==4){
			System.out.print("Enter other employee's password: ");
			String otheremp_pass=scan.next();
			if(otheremp_pass.equals("employee1234")){
				while(exit_flag_employee)
					menuForEmployee();
			}
		}
		else if(selection==5){
		System.out.println("Enter storage password: ");
		String storage_pass=scan.next();
		if(storage_pass.equals("storage1234"));
			while(exit_flag_storage)
				menuForStorage();
		}
		else if(selection==6){
			exit_flag=false;
		}
		
		else if(selection==-1){
			System.err.print("Please enter admin password: ");
			String passw0rd = scan.next();  //-------------------------------IMPORTANT CHANGE IT-----------------------------------
			if(passw0rd.equals("deuceng<3")){
				while(exit_flag_admin)
					menuForAdmin();
			}
		}		
	}
	
	public static void menuForAdmin() {
			
		System.out.println("1-Add manager. ");
		System.out.println("2-Add engineer ");
		System.out.println("3-Add worker ");
		System.out.println("4-Add other employee ");
		System.out.println("5-Delete manager. ");
		System.out.println("6-Delete engineer ");
		System.out.println("7-Delete worker ");
		System.out.println("8-Delete other employee ");
		System.out.println("9-List all the employees");
		System.out.println("10-Exit");
					
		
		int input = scan.nextInt();
		if(input==1){
			
			System.out.print("How many manager will be added: ");
			int managersize = scan.nextInt();
			String position="Manager";
			
			for (int i = 0; i < managersize; i++) {
				System.out.print("Enter person name: ");
				String name_man=scan.next();	
				int id=id_man+1;
				managerList.add(new Manager(name_man,id,position));
				System.out.println();
				id_man++;
			}
			
			
		}
		else if(input==2){
			System.out.print("How many engineer will be added: ");
			int engineer_size = scan.nextInt();
			String position="Engineer";
			for (int i = 0; i < engineer_size; i++) {
				System.out.print("Enter person name: ");
				String name_eng=scan.next();	
				int id=id_eng+1;
				engineerList.add(new Engineer(name_eng,id,position));
				System.out.println();
				id_eng++;
			}
			
		}
		else if(input==3){
			System.out.print("How many worker will be added: ");
			int size = scan.nextInt();
			String position="Worker";
			for (int i = 0; i < size; i++) {
				System.out.print("Enter person name: ");
				String name_worker=scan.next();	
				int id=id_work;
				workerList.add(new Worker(name_worker,id,position));
				System.out.println();
				id_work++;
			}
			
		}
		else if(input==4){
			System.out.print("How many other employee will be added: ");
			int sizeEmp = scan.nextInt();
			String position="Other Employee";
			for (int i = 0; i < sizeEmp; i++) {
				System.out.print("Enter person name: ");
				String name_emp=scan.next();	
				int id=id_emp;
				employeeList.add(new OtherEmployee(name_emp,id,position));
				System.out.println();
				id_emp++;
			}
		}
		else if(input==5){
			System.out.println("Index\tName\tID number");
			for(int i=0;i<managerList.size();i++){
				System.out.println(i+".\t"+managerList.get(i).getName()+"\t"+managerList.get(i).getId());	
			}
			System.out.print("Enter your delete index: ");
			int man_index=scan.nextInt();
			if(man_index >= managerList.size())
				System.err.println("You entered out of index.");
			else{
			managerList.remove(man_index);
			System.out.println("Operation is done successfully.");
			}
		}
		else if(input==6){
			System.out.println("Index\tName\tID number");
			for(int i=0;i<engineerList.size();i++){
				System.out.println(i+".\t"+engineerList.get(i).getName()+"\t"+engineerList.get(i).getId());
				
			}
			System.out.print("Enter your delete index: ");
			int eng_index=scan.nextInt();
			if(eng_index >= engineerList.size())
				System.err.println("You entered out of index.");
			else{
			engineerList.remove(eng_index);
			System.out.println("Operation is done successfully.");
			}
		}
		else if(input==7){
			System.out.println("Index\tName\tID number");
			for(int i=0;i<workerList.size();i++){
				System.out.println(i+"\t"+workerList.get(i).getName()+"\t"+workerList.get(i).getId());
				
			}
			System.out.print("Enter your delete index: ");
			int work_index=scan.nextInt();
			if(work_index >= workerList.size())
				System.err.println("You entered out of index.");
			else{
			employeeList.remove(work_index);
			System.out.println("Operation is done successfully.");
			}

			
		}
		else if(input==8){
			System.out.println("Index\tName\tID number");
			for(int i=0;i<employeeList.size();i++){
				System.out.println(i+".\t"+employeeList.get(i).getName()+"\t"+employeeList.get(i).getId());
				
			}
			System.out.print("Enter your delete index: ");
			int emp_index=scan.nextInt();
			if(emp_index >= employeeList.size())
				System.err.println("You entered out of index.");
			else{
			employeeList.remove(emp_index);
			System.out.println("Operation is done successfully.");
			}
		}
		
		else if(input==9){
			int indexoflist=0;
			System.out.println("Index\tName\tPosition\tID number\tEnter Time\tLeave Time");
			for(int i=0;i<managerList.size();i++){
				System.out.println(indexoflist+".\t"+managerList.get(i).getName()+" \t"+managerList.get(i).getPosition()+" \t"+managerList.get(i).getId()+" \t"+managerList.get(i).getEntertime()+" \t"+managerList.get(i).getLeavetime());
				indexoflist++;
			}
			for(int i=0;i<engineerList.size();i++){
				System.out.println(indexoflist+".\t"+engineerList.get(i).getName()+" \t"+engineerList.get(i).getPosition()+" \t"+engineerList.get(i).getId()+" \t"+engineerList.get(i).getEntertime()+" \t"+engineerList.get(i).getLeavetime());
				indexoflist++;
			}
	
			for(int i=0;i<workerList.size();i++){
				System.out.println(indexoflist+".\t"+workerList.get(i).getName()+" \t"+workerList.get(i).getPosition()+" \t"+workerList.get(i).getId()+" \t"+workerList.get(i).getEntertime()+" \t"+workerList.get(i).getLeavetime());
				indexoflist++;
			}
			for(int i=0;i<employeeList.size();i++){
				System.out.println(indexoflist+".\t"+employeeList.get(i).getName()+" \t"+employeeList.get(i).getPosition()+" \t"+employeeList.get(i).getId()+" \t"+employeeList.get(i).getEntertime()+" \t"+employeeList.get(i).getLeavetime());
				indexoflist++;
			}
		}
		else if(input==10){
			exit_flag_admin=false;
		}
		
		
		//------------------------END OF THE MENU FOR ADMIN--------------------------------
	}

	public static void menuForManager() throws CloneNotSupportedException{
		Manager instMan = new Manager();
		
		System.out.print("Enter your ID(or exit(0)): ");
		int manLoginID=scan.nextInt();
		if(manLoginID==0) {
			exit_flag_manager=false;
		}
		else {
			boolean isExistID=false;
			int indexID=0;
			for(int i=0;i<managerList.size();i++) {
				if(managerList.get(i).getId()==manLoginID) {
					isExistID=true;
					indexID=i;
				}
			}
			if(isExistID) {
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String enterTime  = dateFormat.format(new Date());
				managerList.get(indexID).setEntertime(enterTime);
				
				System.out.println("Succesfully login.");
				System.out.println("1-Add order.");
				System.out.println("2-View order. ");
				System.out.println("3-Orginize order. ");
				System.out.println("4-Add plan. ");
				System.out.println("5-View plan. ");
				System.out.println("6-Orginize plan. ");
				System.out.println("7-Exit");
				System.out.println("8-Company Cars. ");
				System.out.print("Enter your selection: ");
				int selection = scan.nextInt();
				
				if(selection==1){
					System.out.println("Choose(1) purchase or sale (2): ");
					int selection1 = scan.nextInt();
					instMan.addOrder(selection1);
		
				}
				else if(selection==2){
					instMan.viewOrder();
					
				}
				else if(selection==3){
					instMan.orginizeOrder();
				}
				else if(selection==4){
					instMan.addPlan();
				}
				else if(selection==5){
					instMan.viewPlan();
				}
				else if(selection==6){
					instMan.orginizePlan();
				}
				else if(selection==7){
	
					SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					String leaveTime  = dateFormat2.format(new Date());
					managerList.get(indexID).setLeavetime(leaveTime);
					
					exit_flag_manager=false;
					
				}
				else if(selection==8){
					carCache.loadCache();
					
					Vehicles vehicle1 = (Vehicles) carCache.getShape("Carrier");
					System.out.println("Vehicles : " + vehicle1.getCarType() + " name: " + vehicle1.getCarName());
					Vehicles vehicle2 = (Vehicles) carCache.getShape("Private Car");
					System.out.println("Vehicles : " + vehicle2.getCarType() + " name: " + vehicle2.getCarName() );
					
					exit_flag_manager=false;
					
				}
			}
			else {
				System.out.println("Person is not found.");
			}
		}

	}
	
	public static void menuForEngineer(){
		Engineer instEng=new Engineer();
		
		System.out.print("Enter your ID(or exit(0)): ");
		int engLoginID=scan.nextInt();
		if(engLoginID==0) {
			exit_flag_engineer=false;
		}
		else {
			boolean isExistIDeng=false;
			int indexIDeng=0;
			for(int i=0;i<engineerList.size();i++) {
				if(engineerList.get(i).getId()==engLoginID) {
					isExistIDeng=true;
					indexIDeng=i;
				}
			}
			if(isExistIDeng) {
				
				SimpleDateFormat dateFormateng = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String enterTimeeng  = dateFormateng.format(new Date());
				engineerList.get(indexIDeng).setEntertime(enterTimeeng);
		
		
				System.out.println("Succesfully login.");
				System.out.println("1-Add plan. ");
				System.out.println("2-Add machine. ");
				System.out.println("3-View storage. ");
				System.out.println("4-View plan. ");
				System.out.println("5-View order. ");
				System.out.println("6-View machine. ");
				System.out.println("7-Exit");
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				if(choice==1){
					instEng.addPlan();
				}
				else if(choice==2){
					instEng.addMachine();
				}
				else if(choice==3){
					instEng.viewStorage();
				}
				else if(choice==4){
					instEng.viewPlan();
				}
				else if(choice==5){
					instEng.viewOrder();
				}
				else if(choice==6){
					instEng.viewMachine();
				}
				else if(choice == 7){
					
					SimpleDateFormat dateFormatEng2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					String leaveTimeEng  = dateFormatEng2.format(new Date());
					engineerList.get(indexIDeng).setLeavetime(leaveTimeEng);
					
					exit_flag_engineer=false;
				}
			}
			else {
				System.out.println("Person is not found.");
			}
		}
			
		
	}
	public static void menuForWorker() {
		Worker instWorker=new Worker();
		
		System.out.print("Enter your ID(or exit(0)): ");
		int workerLoginID=scan.nextInt();
		if(workerLoginID==0) {
			exit_flag_worker=false;
		}
		else {
			boolean isExistIDwork=false;
			int indexIDwork=0;
			for(int i=0;i<workerList.size();i++) {
				if(workerList.get(i).getId()==workerLoginID) {
					isExistIDwork=true;
					indexIDwork=i;
				}
			}
			if(isExistIDwork) {
				
				SimpleDateFormat dateFormatWork = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String enterTimeWork  = dateFormatWork.format(new Date());
				workerList.get(indexIDwork).setEntertime(enterTimeWork);
				
				System.out.println("Succesfully login.");
				System.out.println("for Exit(0)");
				int selectionWorker=scan.nextInt();
				if(selectionWorker==0) {
					
					SimpleDateFormat dateFormatWork2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					String leaveTimeWork  = dateFormatWork2.format(new Date());
					workerList.get(indexIDwork).setLeavetime(leaveTimeWork);
					
					exit_flag_worker=false;
				}
			}
			else {
				System.out.println("Person is not found.");
			}
		}
		
		
	}
	public static void menuForEmployee() {
		OtherEmployee instEmp =new OtherEmployee();
		
		System.out.print("Enter your ID(or exit(0)): ");
		int empLoginID=scan.nextInt();
		if(empLoginID==0) {
			exit_flag_employee=false;
		}
		else {
			boolean isExistIDemp=false;
			int indexIDemp=0;
			for(int i=0;i<employeeList.size();i++) {
				if(employeeList.get(i).getId()==empLoginID) {
					isExistIDemp=true;
					indexIDemp=i;
				}
			}
			if(isExistIDemp) {
				
				SimpleDateFormat dateFormatEmp= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String enterTimeEmp  = dateFormatEmp.format(new Date());
				employeeList.get(indexIDemp).setEntertime(enterTimeEmp);
				
				System.out.println("Succesfully login.");
				System.out.println("for Exit(0)");
				int selectionEmp=scan.nextInt();
				if(selectionEmp==0) {
					
					SimpleDateFormat dateFormatEmp2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					String leaveTimeEmp  = dateFormatEmp2.format(new Date());
					employeeList.get(indexIDemp).setLeavetime(leaveTimeEmp);
					
					exit_flag_employee=false;
				}
			}
			else {
				System.out.println("Person is not found.");
			}
		}
		
	}

	private static void menuForStorage() {
		Storage stor = new Storage();
		System.out.println("1-Show storage information.");
		System.out.println("2-Add new product. ");
		System.out.println("3-Remove a product. ");
		System.out.println("4-Products producement speed. ");
		System.out.println("5-Exit. ");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		if(choice==1){
			stor.showStorageInfo();
		}
		else if(choice==2){
			System.out.print("How many pieces do you want to add: ");
			int pieces = scan.nextInt();
			for (int i = 0; i < pieces; i++) {
				System.out.print("Enter product's name: ");
				String product_name = scan.next();
				System.out.print("Enter product's type: ");
				String product_type = scan.next();
				stor.productList.add(new Product(product_name,stor.productID,product_type));
				stor.productHISTORY.enqueue(new Product(product_name,stor.productID,product_type));
				stor.productID++;
			}
		}
		else if(choice==3){
			stor.showStorageInfo();
			System.out.print("Please enter the id of the product: ");
			int removeId = scan.nextInt();
			stor.removeProduct(removeId);
			
		}
		else if(choice==4){
			
				System.out.print("Please enter the product ID: ");
				int IDofProduct = scan.nextInt();
				System.out.print("Please enter the amount ");
				int amountProduct = scan.nextInt();
				String newspeed ="";
				for (int i = 0; i < amountProduct; i++) {
					newspeed = newspeed + "|";
				}
				stor.productList.get(IDofProduct).setSpeed(newspeed);
			
			
		}
		else if(choice==5){
			exit_flag_storage=false;
		}
		
	}
}
