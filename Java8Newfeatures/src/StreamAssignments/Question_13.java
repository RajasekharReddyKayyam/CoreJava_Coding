package StreamAssignments;

import java.util.Arrays;
import java.util.List;

public class Question_13 {
	public static void main(String[] args) {
//		This question demonstrates lazy evaluation. Declare the following List<Integer> ls =
//				Arrays.asList(11, 11, 22, 33, 33, 55, 66);
//				a. stream the List (note that this is possible 
//						because List is a Collection and Collection defines a
//				stream() method); ensure only distinct (unique) 
//				numbers are streamed; check if “any match”
//				11. You should get true for this.
//				b. stream the List again (this is necessary 
//						because once a stream is closed by a previous terminal
//				operation, you must re-create the stream); 
//						check to see if “none match” the expression
//				x%11>0. Note that the terminal operation noneMatch(Predicate) 
//				needs to return false for
//				every element in the stream for noneMatch() to return true.
//						In other words, “none of them
//				match this….that’s correct, none of them do; return true”. 
//						You should get true here as well.
		
//
		List<Integer> ls =
			Arrays.asList(11, 11, 22, 33, 33, 55, 66);
	boolean b=	ls.stream().distinct().anyMatch(i->i==11);
	System.out.println(b);
boolean b1=	ls.stream().distinct().noneMatch(x->x%11>0);
System.out.println(b1);
		
		}


}
