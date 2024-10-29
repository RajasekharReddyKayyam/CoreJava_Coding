package StreamAssignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Question_4 {
	public static void main(String[] args) {
//		4. There are several parts to this: 
//		a. Using 1, 2 and 3 create a List of Integers.
//		i. Stream the list and calculate the sum, using the sum() method from IntStream.
//		ii. Stream the list again and calculate the maximum value, using the max() method from
//		IntStream.
//		b. Given the Person class (in the zip file), declare a List typed for Person with the following
//		Person’s:
//		i. “Alan”, “Burke”, 22
//		ii. “Zoe”, “Peters”, 20
//		iii. “Peter”, “Castle”, 29
//		Using the max(Comparator) from Stream, calculate the oldest person in the list.
//		c. Using 10, 47, 33 and 23 create a List of Integers. Stream the list and using the following
//		versions of reduce(), calculate the maximum value:
//		i. Optional<T> reduce(BinaryOperator<T> accumulator)
//		ii. T reduce(T identity, BinaryOperator<T> accumulator)
		
List<Integer> l=Arrays.asList(1,2,3);
int sum=l.stream().mapToInt(i->i).sum();
System.out.println(sum);//6
OptionalInt max=l.stream().mapToInt(i->i).max();
System.out.println(max);
List<Person> p=Arrays.asList(new Person("Alan","Burke",22),new Person ("Zoe","Peters",20),
		new Person ("Peter","Castle",29));
Person p1=p.stream().max(Comparator.comparing(i->i.getAge())).get() ;
System.out.println(p1.getAge());

List<Integer> l1=Arrays.asList(10,47,33,23);
int max2=l1.stream().reduce((a,b)->Integer.max(a, b)).get();
System.out.println(max2);
int max3=l1.stream().reduce(Integer.MIN_VALUE,(a,b)->Integer.max(a, b));
System.out.println(max3);




		
		
		
		
	}

}
