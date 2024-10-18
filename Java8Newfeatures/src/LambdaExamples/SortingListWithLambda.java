package LambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListWithLambda {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList( );
		list.add(10);
		list.add(8);
		list.add(20);
		list.add(4);
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
	}
	

}
