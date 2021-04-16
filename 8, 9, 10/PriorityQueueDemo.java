package tema8;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue1 = new PriorityQueue<String>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> queue2 = new PriorityQueue<String>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		PriorityQueue<String> union = new PriorityQueue<>(queue1);
		union.addAll(queue2);
		
		PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
		intersection.retainAll(queue2);
		
		PriorityQueue<String> difference = new PriorityQueue<>(queue1);
		difference.removeAll(queue2);
		
		System.out.println("Union of sets: "+ union);
		System.out.println("Difference of sets: "+ difference);
		System.out.println("Intersection of sets: "+ intersection);


	}

}
