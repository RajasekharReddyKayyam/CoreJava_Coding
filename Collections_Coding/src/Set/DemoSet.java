package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		HashSet s= new HashSet();
		s.add(10);
		s.add("String");
		s.add("String");
		s.add("String");
		s.add("String");
		s.add("Me");
		System.out.println(s);//[Me, 10, String]//InsertionOrder is  not Preserved 
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(99);
		lhs.add(9);
		lhs.add(989);
		System.out.println(lhs);//[10, 99, 9, 989] insertion order is preserved
		SortedSet ss=new TreeSet();
		ss.add(10);
		ss.add(9);
		ss.add(4);
		ss.add(43);
		System.out.println(ss);
		
		
	}

}
