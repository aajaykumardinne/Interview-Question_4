package TrickyJavaQuestions;

public class PrintZeroToHundred {

	public static void main(String[] args) {

		/**
		 * Output numbers from 0...100 
		 * Without using any numbers in your code
		 */

		
		String s = "programmin";

		int zero = s.length() - s.length();
		int hundred = s.length() * s.length();
		
		for(int i=zero; i<=hundred; i++) {
			System.out.println(i);
		}

	}

}
