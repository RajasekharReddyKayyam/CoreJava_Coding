package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue  {
public static void main(String[] args) {
	Queue q= new PriorityQueue();
	q.add(10);
	q.add(13);
	q.add(7);
	q.add(6);
	System.out.println(q);
	q.poll();
	System.out.println(q);
	
}


}

