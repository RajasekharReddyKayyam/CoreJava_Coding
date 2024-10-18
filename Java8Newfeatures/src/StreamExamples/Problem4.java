

package StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove all duplicate elements from a list using streams.
       List<Integer > list = new ArrayList();
       list.add(10);
       list.add(11);
       list.add(10);
       list.add(13);
       list.add(1);
       list.add(12);
       System.out.println(list);
       List<Integer> l=list.stream().distinct().collect(Collectors.toList());
    System.out.println(l);
       


	}

}
