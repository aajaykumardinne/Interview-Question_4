package PracticeQuestions;

public class Factorial {
	
	
	// Factorial of 5 =  5 * 4 * 3 * 2 * 1
	// Factorial of 4 =  4 * 3 * 2 * 1
	// Factorial of 1 =  1
	// Factorial of 0 =  1
	
	// without recursive  using for loop
	public static  int factorial(int num) {
		
		int fact = 1;
		
		if(num==0)
			return 1;
		for(int i=1 ; i<=num ;i++) {
			fact = fact * i;
		}
		return fact;
		
	}
	
	// with recursive - function calling itself
	public static int factorialnumber(int num) {
		
		if(num==0)
			return 1;
		else {
			return (num*factorial(num-1));
		}
					
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		System.out.println(factorial(6));
		
		
		System.out.println("**");
		
		System.out.println(factorialnumber(5));
		System.out.println(factorialnumber(3));
		System.out.println(factorial(10));
		System.out.println(factorial(0));
		

	}

}
