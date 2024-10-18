package PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		String s="String";
		Function <String ,Integer> f=str->str.length();
		int result=f.apply(s);
		System.out.println(result);
	}

}
