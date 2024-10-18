package StreamExamples;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem01 {
public static void main(String[] args) {
	//write a Java program to convert a list of strings to uppercase or lowercase using streams.
	List <String> list= new LinkedList();
	list.add("rajI");
	list.add("rAvi");
	list.add("shIva");
	list.add("raM");
	System.out.println("List of Strings before converting"+list);
	
	System.out.println("*****************************************************");
	
	System.out.println("Converting to uppercase ");
	List <String> l=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
	System.out.println(l);
	
	System.out.println("*****************************************************");
	List<String> l1=list.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
	System.out.println("Converting to lowercase  ");
	System.out.println(l1);
}
}
