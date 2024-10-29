package StreamAssignments;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Question_1 {
	public static void main(String[] args) {
		//Stream a list of int primitives between the range of 0 (inclusive) and 5 
		//(exclusive). Calculate and output the average.
		//Range
		IntStream s=IntStream.range(0, 5);
		
	//s.forEach(System.out::println);
	OptionalDouble avg=s.average();
	System.out.println(avg);//2.0
	
	OptionalDouble s1=IntStream.rangeClosed(0, 5).average();
	System.out.println(s1);//2.5
	
	
	
	
		
	}
	
}
