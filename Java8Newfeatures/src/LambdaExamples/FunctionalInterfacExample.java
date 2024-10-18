package LambdaExamples;
@FunctionalInterface 
public interface FunctionalInterfacExample {
	
	public int sum( int a,int b);
	//from java 8 we can have default and static methods in functional interface 
	default void fun() 
	{
		System.out.println("fun method executed ");
	}
	static void bun() {
		System.out.println("bun method executed ");
		
	}

}
