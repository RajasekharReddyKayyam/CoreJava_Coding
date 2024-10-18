package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList LL= new LinkedList();
		LL.add(10);
		LL.add("Mahesh");
		LL.add(10.8);
		LL.add('s');
		System.out.println(LL);//[10, Mahesh, 10.8, s]
		LL.add(3, 34);
		System.out.println(LL);//[10, Mahesh, 10.8, 34, s]
		LL.addFirst(1);
		System.out.println(LL);//[1, 10, Mahesh, 10.8, 34, s]
		LL.addLast(44);
		System.out.println(LL);//[1, 10, Mahesh, 10.8, 34, s, 44]
		
//		//LL.addAll(LL);//Which will add same Collection
//        System.out.println(LL);//[1, 10, Mahesh, 10.8, 34, s, 44, 1, 10, Mahesh, 10.8, 34, s, 44]
//         //Iterating Linked List
//        
//        Iterator itr=LL.iterator();
//       while(itr.hasNext()) {
//    	   System.out.println(itr.next());
//       }
    System.out.println("*****************");
       ListIterator litr=LL.listIterator();
       while(litr.hasNext()) {
    	   System.out.println(litr.next());
       }
       System.out.println("*******************");
       while(litr.hasPrevious()) {
    	   System.out.println(litr.previous());
       }
       
     
        


	}

}
