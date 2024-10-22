package Methodreferences;

import java.util.function.Function;
import java.util.function.Supplier;

public class BoundedMethodreference {
	public static void main(String[] args) {
		String name="Raj";
		Supplier<String >s=()->name.toLowerCase();
		Supplier<String >s1=name::toLowerCase;
		System.out.println(s.get());
		System.out.println(s1.get());
		//Unbounded Method Reference
		Function<String,String> f=(S)->S.toUpperCase();
		Function<String,String> f1=String::toUpperCase;
		System.out.println(f.apply("raj"));
		System.out.println(f1.apply("raj"));
		
		
		
	}

}
