package PredefinedFunctionalInterfaces;

import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class custompredicatecheck {
	public static void main(String[] args) {
		CustomPredicateInterface<Integer> t=i->i>0;
		System.out.println(t.check(10));
		System.out.println(t.check(10));
		//predicate
		Predicate<Integer> p=i->i<22;
		System.out.println(p.test(10));//true
	System.out.println(p.negate());	
	BiPredicate <String,Integer> Bi=(str,len)->str.length()==len;
	System.out.println(Bi.test("raj", 7));
	Supplier<LocalTime> s=()->LocalTime.now();	
	System.out.println(s.get());
	Consumer<String>c= string->System.out.println(string);
	c.accept("From consumer");
	BiConsumer<String ,String>bc= (s1,s2)->System.out.println(s1+s2);
	bc.accept("Hello","Welcome");
	
	Function<String,Integer> f=s1->s1.length();
	System.out.println(f.apply("rajashekar"));
	
	UnaryOperator<String> UO=ss->ss;
	System.out.println(UO.apply("raj"));
	
	
	
	
	
	
	}

}
