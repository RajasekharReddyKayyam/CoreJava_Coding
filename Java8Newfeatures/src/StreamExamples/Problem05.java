package StreamExamples;

import java.util.ArrayList;
import java.util.List;

public class Problem05 {
	public static void main(String[] args) {
		// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
		
		List<String> l= new ArrayList<String>();
		l.add("Raj");
		l.add("Ravi");
		l.add("shiva");
		l.add("krishna");
		l.add("sambu");
		System.out.println(l);
		long list= l.stream().filter(str->str.startsWith("R")).count();
		System.out.println(list);
		
	}

}
