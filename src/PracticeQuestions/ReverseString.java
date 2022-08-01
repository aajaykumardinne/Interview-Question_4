package PracticeQuestions;

public class ReverseString {

	public static void main(String[] args) {

		//Reverse a String without using the existing functions
		
		// 1. Difference between String and String buffer
		// String is immutable object and has no reverse function
		// Stringbuffer is mutable object and reverse function exists
		
		// 2. Do  we have a reverse function in String : No
		
		
		String s = "Selenium";

		// 1. using for loop
		int len = s.length();
		String rev = ""; // blank variable

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i); // muineles
		}

		System.out.println(rev);

		// 2. Using string buffer class
		StringBuffer sbuf = new StringBuffer(s);
		System.out.println(sbuf.reverse());

	}

}
