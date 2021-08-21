package tester;

import java.util.Scanner;
import stack.Stack;

import stack.IStack;

public class TestStack {

	public static void main(String[] args) {
		   try (Scanner sc = new Scanner(System.in)) {
	            System.out.print("Enter size of stack : ");
	            IStack stack = new Stack(sc.nextInt());

	            boolean flag = true;

	            do {
	                System.out.println("1. Push");
	                System.out.println("2. Pop");
	                System.out.println("3. Check if empty");
	                System.out.println("4. Check if full");
	                System.out.println("5. Display all elements");
	                System.out.println("0. Quit");
	                System.out.println("Choose any option:");
	            
	              

	                try {
	                    switch (sc.nextInt()) {
	                        case 1:
	                            System.out.print("Enter a number : ");
	                            stack.push(sc.nextInt());
	                            break;
	                        case 2:
	                            System.out.println("Element popped : " + stack.pop());
	                            break;
	                        case 3:
	                            System.out.println("Is stack empty ? " + stack.isEmpty());
	                            break;
	                        case 4:
	                            System.out.println("Is stack full ? " + stack.isFull());
	                            break;
	                        case 5:
	                        	System.out.println("\nShow elements of stack:");
	                        	stack.display();
	                        	break;
	                        case 6:
	                        	
	                        	break;
	                        case 0:
	                            flag = false;
	                            break;
	                        default:
	                            System.out.println("Invalid choice");
	                    }
	                }
	                catch (Exception e) {
	                	 System.out.println("Error");
					}
	               
	            } while(flag);
		   }
	}

}
