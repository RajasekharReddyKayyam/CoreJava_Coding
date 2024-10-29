package StreamAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Question_9 {
	public static void main(String[] args) {
//		9. Given the Person class (in the zip file), declare a List typed for Person
		
		
//		with the following Person’s:
//			a. name=”Bob”, age=31
//			b. name=”Paul”, age=32
//			c. name=”John”, age=33
//			Pipeline the following where the return type is double: (QID 2.1810)
//			 stream the people
//			 filter the stream for Person’s whose age is < 30
//			 map to int primitives
//			 calculate the average age.
//			This should generate a NoSuchElementException. Using orElse(), 
//	fix the pipeline (not the filter) so
//			that 0.0 is returned instead of an exception being generated.
		
		
		List<Person> person=Arrays.asList(
				new Person("Bob",31),
				new Person ("Paul",32),
				new Person("John",33)
				);
	double avg=	person.stream().filter(i->i.getAge()<30).mapToInt(i->i.getAge()).average().orElse(0.0);
	System.out.println(avg);
				
	}

}
