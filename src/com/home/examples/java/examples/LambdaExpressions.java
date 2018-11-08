package com.home.examples.java.examples;

// Lambda expressions is a way of passing a block of code to a 
// function or method, in a cleaner way in Java 8
//
interface Executable {
	// void execute();
	// int execute();
	int execute(int a, int b);
}
/*interface StringExecutable {	
	int execute(String s);
}
*/
public class LambdaExpressions {
	
	public void run (Executable e) {
		System.out.println("executing code block");
		int a = 12;
		int value = e.execute(a, 13);
		System.out.println("return value=" + value);		
	}
	/*public void run (StringExecutable s) {
		System.out.println("Stringexecutable code block");
		String a = "hello";
		int value = s.execute(a);
		System.out.println("return value=" + value);		
	}
	*/
	
	public static void main (String [] args) {
	
		LambdaExpressions runner = new LambdaExpressions();
		runner.run(new Executable()
				{
					public int execute(int a, int b) {
						System.out.println("Hello there");
						return 7 + a + b ;
					}
				});	
		
		// System.out.println("====These are lambda expressions below==");		
		// runner.run(()-> System.out.println("Hello there"));
		
		// runner.run(()-> {
		//	System.out.println("Hello there");
		//	System.out.println("This is code passed in lambda expression ");
		//	return 8;
		// });
		
		//System.out.println("====This is a lambda expression below==");
		// runner.run(()-> { return 8; });
		
		System.out.println("====These are lambda expressions below==");
		runner.run((int a, int b)-> 8);		
	/*	runner.run((String a) -> {
						System.out.println("Hello there");
						return 7 ;
					});
	*/
	}
}

/*	System.out.println("===This is a lambda expression below==");		
	runner.run(()-> System.out.println("Hello there"));

	runner.run(()-> {
	System.out.println("Hello there");
	System.out.println("This is code passed in lambda expression ");
	});
System.out.println("====This is a lambda expression below==");
	runner.run(()-> { return 8; });
		
System.out.println("====This is a lambda expression below==");
	runner.run(()-> 8);

runner.run((int a)-> 8);		
runner.run( a -> {
				System.out.println("Hello there");
				return 7 + a ;
			});
*/
