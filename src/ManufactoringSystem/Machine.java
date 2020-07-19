package ManufactoringSystem;

import java.util.*;

public class Machine {
		
	private String name;
	private int id;
	private String type;
	private String duty;
	private String currentStatus;
	
	public Machine(String name, int id, String type) {
		this.name = name;
		this.id = id;
		this.type = type;
	}
	public Machine(){
		
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

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
}
