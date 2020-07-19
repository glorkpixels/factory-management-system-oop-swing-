package ManufactoringSystem;

public class Plan {
	private String name;
	private int id;
	private String type;
	private String content;
	boolean isCurrent=true;
	
	public Plan(String name, int id, String type) {
		this.name = name;
		this.id = id;
		this.type = type;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public boolean isCurrent() {
		return isCurrent;
	}
	
	public void setCurrent(boolean current){
		this.isCurrent=isCurrent;
	}
	
}
