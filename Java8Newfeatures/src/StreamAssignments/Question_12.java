package StreamAssignments;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Question_12 {
	public static void main(String[] args) {
//		12. There are two parts:
//			a. Generate a DoubleStream using the of() method consisting of 
//			the numbers 0, 2 and 4. Note
//			that this stream is a stream of primit
//			ives and not a stream of types. Filter in odd numbers only
//			and sum the remaining stream. You should get 0. (QID 2.2024)
//			b. Using 1.0 and 3.0, generate a stream of Double’s. 
//			Map them to primitive double’s. Filter in
//			even numbers only and calculate the average. 
//			Output the result without running the risk of
//			generating an exception.
	DoubleStream d=	DoubleStream.of(0,2,4);
	double s=d.filter(i->i%2!=0).sum();
	System.out.println(s);
	Stream<Double> ds=Stream.of(1.0,3.0);
	OptionalDouble avg=ds.mapToDouble(i->i).filter(i->i%2==0).average();
	System.out.println(avg);
	
		
	}

}
