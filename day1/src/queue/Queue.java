package queue;

public class Queue implements IQueue {
	private int capacity;
	private int queueArr[];
	private int front;
	private int rear;
	private int currentSize = 0;
	
	public Queue(int size) {
		this.capacity = size;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
	}

	@Override
	public void enqueue(int data) {
		  if (isFull()) {
	            System.out.println("Queue is full!! ");
	        } else {
	            rear++;
	            if (rear == capacity - 1) {
	                rear = 0;
	            }
	            queueArr[rear] = data;
	            currentSize++;
	            System.out.println(data + " added to the queue");
	        }
		
	}

	@Override
	public void dequeue() {
		 if (isEmpty()) {
	            System.out.println("Queue is empty!!");
	        } else {
	            front++;
	            if (front == capacity - 1) {
	                System.out.println(queueArr[front - 1] + " removed from the queue");
	                front = 0;
	            } else {
	                System.out.println(queueArr[front - 1] + " removed from the queue");
	            }
	            currentSize--;
	        }
		
	}

	@Override
	public boolean isFull() {
		 if (currentSize == capacity) {
	            return true;
	        }
	        return false;
	}

	@Override
	public boolean isEmpty() {
		  if (currentSize == 0) {
	            return true;
	        }
	        return false;
	}

	
	@Override
	public void display() {
		for(int i=front+1;i<=rear;i++)
			System.out.print(queueArr[i]+" ");
		System.out.println();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
