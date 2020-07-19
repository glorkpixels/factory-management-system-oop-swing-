package ManufactoringSystem;


public class QueueEmpty extends Exception 
{
  
	public QueueEmpty()
	{
		super() ;
		System.err.println("Queue is empty");
	}
}
