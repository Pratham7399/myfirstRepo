package tester;

import java.util.Scanner;

import queue.IQueue;
import queue.Queue;
import stack.IStack;
import stack.Stack;

public class TestQueue {

	public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
	            System.out.print("Enter size of Queue : ");
	            IQueue queue = new Queue(sc.nextInt());

	            boolean flag = true;

	            do {
	            	 System.out.println("Operations on Queue");
	                System.out.println("1. Enqueue");
	                System.out.println("2. Dequeue");
	                System.out.println("3. Check if empty");
	                System.out.println("4. Check if full");
	                System.out.println("5. Display all elements");
	                System.out.println("0. Quit");
	                System.out.println("Make a choice");
	                try {
	                    switch (sc.nextInt()) {
	                        case 1:
	                            System.out.print("Enter a number : ");
	                            queue.enqueue(sc.nextInt());
	                            break;
	                        case 2:
	                           queue.dequeue();
	                            break;
	                        case 3:
	                            System.out.println("Is Queue empty ? " + queue.isEmpty());
	                            break;
	                        case 4:
	                            System.out.println("Is Queue full ? " + queue.isFull());
	                            break;
	                        case 5:
	                        	System.out.println("\nShow elements of  Queue");
	                        	queue.display();
	                        	break;
	                        case 0:
	                            flag = false;
	                            break;
	                        default:
	                            System.out.println("Invalid choice");
	                    }
	                }  catch (Exception e) {
						// TODO: handle exception
					}

	} while(flag);

}
	}}
