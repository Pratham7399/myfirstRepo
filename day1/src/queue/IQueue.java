package queue;

public interface IQueue {
	public void enqueue(int data);

	public void dequeue();

	public boolean isFull();

	public boolean isEmpty();
	public void display();

}
