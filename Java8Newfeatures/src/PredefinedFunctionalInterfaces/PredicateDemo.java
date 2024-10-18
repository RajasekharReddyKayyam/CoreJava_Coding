package PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		int salary=1000;
		Predicate <Integer> p=i->i<500;
		boolean result =p.test(salary);
		System.out.println(result);
		
		
		
	//Before predicate
//		int salary=1000;
//	boolean result=	salarycheck(salary);
//	}
//
//	public  static  boolean salarycheck(int salary) {
//		// TODO Auto-generated method stub
//		if (salary>2000) {
//				System.out.println("it is greater than 2k");
//				return true;
//				
//		}
//		else {
//		System.out.println("less than 2k");
//		return  false;
//		}
//		
//		
//	}
	
	}
}
