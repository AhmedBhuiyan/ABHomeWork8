package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		queue.add("Ahmed");
		queue.add("Ali");
		queue.add("Barry");
		queue.add("uddin");
		queue.add("Muneeb");
		
		System.out.println(queue.element());
		System.out.println(queue.element());

	}

}
