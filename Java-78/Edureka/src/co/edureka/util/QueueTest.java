package co.edureka.util;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=10;i>0;i--) {
			pq.add(i);
		}
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());	
		System.out.println(pq);
	}
}
