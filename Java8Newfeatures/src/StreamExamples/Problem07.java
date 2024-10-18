package StreamExamples;

import java.util.ArrayList;
import java.util.List;

public class Problem07 {
	public static void main(String[] args) {
		//. Write a Java program to find the maximum and minimum values in a list of integers using streams.
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(12);
		l.add(100);
		l.add(1);
		l.add(15);
		l.add(23);
		int maxvalue=l.stream().mapToInt(Integer::intValue).max().orElseThrow(() -> new RuntimeException("List is empty"));
		System.out.println(maxvalue);
		int minvalue=l.stream().mapToInt(Integer::intValue).min().orElseThrow(() -> new RuntimeException("List is empty"));
	   System.out.println(minvalue);
	   int SecondMinval=l.stream().distinct()
			      .sorted()
			      .skip(1)
			      .findFirst()
			      .orElse(null);
	   System.out.println(SecondMinval);
	   
	   
	}

}
