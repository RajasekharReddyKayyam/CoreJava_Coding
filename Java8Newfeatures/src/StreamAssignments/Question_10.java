package StreamAssignments;

import java.util.Optional;

public class Question_10 {
	public static void main(String[] args) {
//		. A question about Optional. Let us look at this in parts:
//			a. Declare an Optional, typed for Double, named ‘price’ using the Optional.ofNullable(20.0).
//			Output the Optional value for ‘price’ 3 times: using ifPresent(Consumer), orElse(T) and
//			orElseGet(Supplier). (QID 2.1849)
//			b. declare a new Optional, typed for Double, named ‘price2’ (or comment out (a) and re-use
//			‘price’). Use Optional.ofNullable again but this time, pass in null.
//			i. Output ‘price2’ in a normal System.out.println().
//			ii. check to see if price2 isEmpty() and if so output “empty”.
//			iii. do (ii) again except this time use the more functional “ifPresent(Consumer)” method.
//			iv. initialise a Double x to the return of “price2.orElse(44.0)”. Output and observe the
//			value of x.
//			c. declare a new Optional, typed for Double, named ‘price3’ (or comment out (b) and re-use
//			‘price’). Use Optional.ofNullable passing in null.
//			i. initialise a Double z to the return of “price3.orElseThrow(() -> new
//			RuntimeException(“Bad Code”). Output and observe the value of z.
//		Optional <Double> price=Optional.ofNullable(null);
//		price.ifPresent(i->System.out.println(i));
//		Double d=price.orElse(10.0);
//		System.out.println(d);
//		Double num=price.orElseGet(()->Math.random());
//		System.out.println(num);
//		Optional <Double> price2=Optional.ofNullable(null);
//		System.out.println(price2);//Optional.empty
//		if(price2.isEmpty()) {
//			System.out.println("empty");
//		}
//		price2.ifPresent(i->System.out.println(i));
//		Double x=price2.orElse(44.0);
//		System.out.println(x);
		Optional <Double> price3=Optional.ofNullable(null);
	Double z=	price3.orElseThrow(() -> new RuntimeException("Bad Code"));
	System.out.println(z);
		
		
		
		
		
		
	}

}
