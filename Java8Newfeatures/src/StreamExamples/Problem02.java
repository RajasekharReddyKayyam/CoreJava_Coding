package StreamExamples;

import java.util.ArrayList;
import java.util.List;

public class Problem02 {
	public static void main(String[] args) {
		// Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
	
	List<Integer> list= new ArrayList<>();
	list.add(10);
	list.add(12);
	list.add(1);
	list.add(19);
	list.add(22);
	list.add(13);
	
	int evensum=list.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
	System.out.println(evensum);
	
	}

}
