package StreamAssignments;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Question_14 {
public static void main(String[] args) {
//	4. Examine the following code. Note that an AtomicInteger is a 
//	version of Integer that is safe to use in
//	concurrent (multi-threaded) environments. The method 
//	incrementAndGet() is similar to ++ai
//	a) Why is the value of ai at the end 0 (and not 4)? 
//
	AtomicInteger ai=new AtomicInteger();
	Stream.of(11,11,22,33).parallel().filter(n->{ai.incrementAndGet();
	return n%2==0;}).forEach(i->System.out.println(i));
	System.out.println(ai);
	}
}
