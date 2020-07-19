package ManufactoringSystem;


public class QueueFull extends Exception 
{
	
	public QueueFull()
	{
		super();
		System.err.println("Queue is full");
	}

}
