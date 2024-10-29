package StreamAssignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question_2 {
	public static void main(String[] args) {
/*2. Given the Item class (in the zip file), declare a List typed for Item with the following Item’s:
		a. id=1 name=”Screw”
		b. id=2 name=”Nail”
	    c. id=3 name=”Bolt”
	Stream the list and sort it so that it outputs “BoltNailScrew” i.e. alphabetic name order.
	 Use Stream’s forEach method to output the names 
	 (use the method reference version for the required Consumer
lambda). 
				*/
		
		List<Item> l=Arrays.asList(new Item(1,"Screw"),new Item(2,"Nail"),new Item(3,"Bolt"));
//		l.stream().sorted((a,b)->a.getId().compareTo(b.getId())).forEach(System.out::print);//ScrewNailBolt
//		System.out.println();
//		l.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::print);//BoltNailScrew
//		System.out.println();
//		l.stream().sorted(Comparator.comparing(a->a.getName())).forEach(System.out::print);;
//		System.out.println();
		l.stream().map((i)->i.getName()).sorted().forEach(System.out::print);//BoltNailScrew
		System.out.println();
		l.stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::print);//ScrewNailBolt
		
	}

}
