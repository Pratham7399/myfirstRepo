package stack;

import java.util.Arrays;

public class Stack implements IStack {
	   private int top;
	   private int[] array;
	   
	   public Stack (int size) {
	        this.top = -1;
	        this.array = new int[size];
	    }
	   
	@Override
	public void push(int element) {
		  if (this.isFull()) {
	            System.out.println("Stack is full.");
	        }
	        this.array[++top] = element;
	}

	@Override
	public int pop() {
		  if (this.isEmpty()) {
	           System.out.println("Stack is empty");
	        }
	        return this.array[top--];
	}

	@Override
	public boolean isEmpty() {
		 return this.top == -1;
	}

	@Override
	public boolean isFull() {
		
		 return this.top == this.array.length - 1;
	}

	@Override
	public String toString() {
		return "Stack:" + Arrays.toString(array);
	}

	@Override
	public void display() {
		for(int i=0;i<=top;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
	}

}
