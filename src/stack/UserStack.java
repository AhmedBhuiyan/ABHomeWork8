package stack;

import java.util.Stack;

public class UserStack {

	public static void main(String[] args) {

			Stack<String> stack= new Stack<String>();
			
			stack.push("Plate-1");
			stack.push("Plate-2");
			stack.push("Plate-3");
			stack.push("Plate-4");
			stack.push("Plate-5");
			stack.push("Plate-6");
			
			if (stack.peek().equals("Plate-6")) {
			System.out.println(stack.pop());
			
			}
			System.out.println(stack.peek());

			

	}

}
