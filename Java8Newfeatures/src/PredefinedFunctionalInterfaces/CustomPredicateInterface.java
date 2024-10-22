package PredefinedFunctionalInterfaces;
@FunctionalInterface
public interface CustomPredicateInterface<T> {
	
	boolean check(T t);
	default CustomPredicateInterface<T> negation() {
		
		return (i)->!check(i);
		
	}

}
