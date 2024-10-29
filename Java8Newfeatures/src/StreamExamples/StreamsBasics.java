package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBasics {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(3,2,33);
		Stream<Integer> s=l.stream();
		System.out.println(s);
	Integer num=	l.stream().reduce(10, (a,b)->a+b);
	Optional<Integer> num1=	l.stream().reduce((a,b)->b);
	//Useful for parallel Steams 
	Integer num2=	l.stream().reduce(0, (a1,a2)->a1+a2, (b1,b2)->b1+b2);
	System.out.println(num1);
	System.out.println(num);
	System.out.println(num2);
	
	
		
		
	}

}
