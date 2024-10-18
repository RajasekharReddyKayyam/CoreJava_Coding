package Stack;

import java.util.Enumeration;
import java.util.Stack;

public class DemoStack {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.add(10);
		s.add("manish");
		s.add("shivani");
		System.out.println(s);
//		s.addAll(s);
		System.out.println(s);
		System.out.println(s.capacity());//10
		s.trimToSize();//Will reduce default size to the elements present in the stack
		System.out.println(s.capacity());//6
	    Enumeration enu=s.elements();
	    while(enu.hasMoreElements()) {
	    	System.out.println(enu.nextElement());
	    }
	    System.out.println("************");
	  System.out.println( s.peek()); 
	 s.pop();
	 System.out.println(s);
	 s.push(1000);
	 System.out.println(s);
		
	}

}
