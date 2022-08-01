package TrickyJavaQuestions;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoop {

	/**
	 * print 1 to 100 without using any loop 
	 * 1. recursive functions 
	 * 2. Java Streams
	 * 
	 */
	
	public static void main(String[] args) {

		printNumber(1);
		printNumber(20, 40);
		
		IntStream.range(1, 101).forEach( e -> System.out.println(e));

	}

	public static void printNumber(int num) {

		if (num <= 100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}

	}
	
	public static void printNumber(int stNum, int endNum) {

		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}

	}

}
