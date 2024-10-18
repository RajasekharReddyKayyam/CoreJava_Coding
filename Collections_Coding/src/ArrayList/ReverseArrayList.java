package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList();
		list.add(10);
		list.add(15);
		list.add(7);
		list.add(1);
		System.out.println(list);//[10, 15, 7, 1]
	
			reverselist(list);
			System.out.println(list);
			
		}
	 public static  void reverselist(ArrayList<Integer> list) {
		 ArrayList<Integer > reversed=new ArrayList();
		 ListIterator<Integer> itr = list.listIterator(list.size());
		 while(itr.hasPrevious()) {
			
			 reversed.add(itr.previous());
		 }
		 list.clear();
		 list.addAll(reversed);
		 
	}

}
