package LambdaExamples;

public class LambdaInvocation {
	public static void main(String[] args) {
		FunctionalInterfacExample f=(a,b)->{
			
           System.out.println("This is the implementation of the Sum ");
        
		return a+b;
		};
	System.out.println(f.sum(10,11));
		f.fun();
		FunctionalInterfacExample.bun();
		
	}

}
