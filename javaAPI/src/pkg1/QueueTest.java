package pkg1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<>();
//		queue.add("Task 1");
//		queue.add("Task 2");
//		
//		System.out.println(queue.element());

		Deque<String> queue = new LinkedList<>();
		queue.addLast("Task 1");
		queue.offer("Task 2 ");
		
		queue.addFirst("Task 3");
		queue.offerFirst("Task 4");

//		System.out.println(queue.element());
		
		for(String task : queue) {
			System.out.println(task);
		}
		String head = queue.peek();
		System.out.println("Head : " + head);
		
		String removedElenent = queue.poll();
		
		System.out.println("Removed: " + removedElenent);

	}
}
