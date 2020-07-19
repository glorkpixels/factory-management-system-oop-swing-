package ManufactoringSystem;

public interface IReport {
	
	public String getName();
	public void setName(String name);
	
	public int getId();
	public void setId(String id);
	
	public String getType();
	public void setType(String type);

	public void reportDetails();
}
