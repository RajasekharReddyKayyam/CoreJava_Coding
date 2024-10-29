package StreamAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Question_6 {
	public static void main(String[] args) {
//		 Given the Book class (in the zip file), declare a 
		//List typed for Book with the following Book’s:
//			a. title=”Thinking in Java”, price=30.0
//			b. title=”Java in 24 hrs”, price=20.0
//			c. title=”Java Recipes”, price=10.0
//			Stream the books and calculate the 
		//average price of the books whose price is > 10.
//			Change the filter to books whose price is > 90. 
		//Ensure you do not get an exception. 
		
		List<Book> list=Arrays.asList(
				
				new Book("Thinking in Java",30.0),
				new Book("Java in 24 hrs",20.0),
				new Book("Java Recipes",10.0)
				
				);
		OptionalDouble avg=list.stream().filter(i-> i.getPrice()>10).mapToDouble(i->i.getPrice()).average(); 
		System.out.println(avg);
		OptionalDouble avg2=list.stream().filter(i-> i.getPrice()>90).mapToDouble(i->i.getPrice()).average();
		System.out.println(avg2);
	}

}
