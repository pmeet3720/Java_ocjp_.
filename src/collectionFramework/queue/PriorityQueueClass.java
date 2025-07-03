package collectionFramework.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	
	 public static void main(String[] args) {
		// Priority queue -- [priority_task] -- [Sorting techniques]
		 
		//natural odering -- 0 to 9/ [A-Z]/ [a-z]
		 
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("meet");
		queue.add("kabir");
		queue.add("sagar");
		queue.add("neha");
		queue.add("sarita");
		queue.add("dev");
		queue.add("vraj");
		
		System.out.println("Queue.size(): "+queue.size());
		Iterator<String> itr = queue.iterator();
		
		while(!queue.isEmpty()) {
			String s = queue.poll();
			System.out.println(s);
		}

		
	}

}
