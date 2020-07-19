package ManufactoringSystem;


public interface IQueue 
{
	public void enqueue(Object item) throws QueueFull;
	public Object peek() throws QueueEmpty;
	public Object dequeue() throws QueueEmpty;;
	public boolean isEmpty();

}
