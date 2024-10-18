package StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem06 {
	public static void main(String[] args) {
		//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

		List<String> l= new ArrayList<String>();
		l.add("Raj");
		l.add("Ravi");
		l.add("Shiva");
		l.add("Krishna");
		l.add("Sambu");
		l.add("Ananth");
		List<String> sortedlist=l.stream().sorted().collect(Collectors.toList());
		List<String> sortedlistDesc=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortedlistDesc); 
		
		System.out.println(sortedlist);
	}

}
