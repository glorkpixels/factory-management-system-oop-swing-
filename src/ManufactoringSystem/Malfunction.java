package ManufactoringSystem;

public class Malfunction {
	private String name;
	private int id;
	private String currentSituation;
	public boolean existance;
	
	public Malfunction(String name, int id, String currentSituation) {
		this.name = name;
		this.id = id;
		this.currentSituation = currentSituation;
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
	public String getCurrentSituation() {
		return currentSituation;
	}
	public void setCurrentSituation(String currentSituation) {
		this.currentSituation = currentSituation;
	}
	public boolean isStillExist() {
		return existance;
	}
	
	

}
