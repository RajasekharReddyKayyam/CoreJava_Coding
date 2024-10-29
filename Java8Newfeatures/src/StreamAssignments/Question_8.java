package StreamAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_8 {
	
	public static void main(String[] args) {
//		Given the Book class (in the zip file), declare a List typed for
		//Book with the following Book’s:
//			a. title=”Gone with the wind”, price=5.0
//			b. title=”Gone with the wind”, price=10.0
//			c. title=”Atlas shrugged”, price=15.0
//			In a pipeline which has no return type: (QID 2.1847)
//			 stream the books
//			 using the collect() method, generate a Map that maps the book title to its price
//			 using forEach(), output the title and price of each entry in the map
//			What happened and why? Fix this by using the Collectors.toMap(Function, Function,
//			BinaryOperator) method
		List <Book>list=Arrays.asList(
				
				new Book ("Gone With the wind",5.0),
				new Book ("Gone With the wind",10.0),
				new  Book("Atlas shrugged",5.0)
				);
		 Map<String, Double> bookMap = list.stream()
		            .collect(Collectors.toMap(
		                book -> book.getTitle(),        // Key mapper: book title
		                book -> book.getPrice(),        // Value mapper: book price
		                (price1, price2) -> price1 + price2 // Merge function: sum prices for duplicate titles
		            ));
		
		    bookMap.forEach((title, price) -> System.out.println(title + ": " + price));
		
		
				
				
		
	}

}
