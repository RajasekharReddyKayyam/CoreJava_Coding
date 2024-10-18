package StreamExamples;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
	public static void main(String[] args) {
		 //Write a Java program to calculate the average of a list of integers using streams.
	
	List <Integer> list = new ArrayList();
	list.add(10);
	list.add(13);
	list.add(1);
	list.add(14);
	double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	System.out.println(avg);
	
	}

}
