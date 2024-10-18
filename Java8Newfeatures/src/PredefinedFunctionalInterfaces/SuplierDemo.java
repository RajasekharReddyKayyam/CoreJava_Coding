package PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SuplierDemo {
public static void main(String[] args) {
	Supplier<String> s=()->"Here we supplying String cosuming Nothing ";
	
	System.out.println(s.get());
	//Method reference 
	Supplier<String> s2=SuplierDemo::getHelloWorld;
	System.out.println(s2.get());
	
}
public static String getHelloWorld() {
    return "Hello, world! of lambda";
}
}
