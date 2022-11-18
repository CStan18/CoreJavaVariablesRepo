package com.perscholas.java_basics;
/**
 * 
 * @author caleb
 * @classSection 12-2022-JAVA
 * @instructor Ms. Lewis
 * @date 11/17/2022
 * @programOverview binary problems, 
 *
 */
public class OperatorsAndNumbersCoreJava {

	public static void printOutputSeperator() {
		System.out.println("*****************************");
	}
	/**
	 * write these nums in binary
	 * 1, 8, 33, 78, 787, 33987
	 * 
	 * binary table to help convert
	 * 32768 16384 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
	 * 	  0                    0                0           0
	 * 1 -> 0001
	 * 8 -> 1000
	 * 33 -> 0010 0001
	 * 78 -> 0100 1110
	 * 787 -> 0011 0001 0011
	 * 33987 -> 1000 0100 1100 0011
	 */
	
	/**
	 * write these nums in decimal notation
	 * 0010 -> 2
	 * 1001 -> 9
	 * 0011 0100 -> 52
	 * 0111 0010 -> 114
	 * 0010 0001 1111 -> 543
	 * ]0010 1100 0110 0111 -> 11367
	 * 
	 */
	
	/**
	 * demonstrate left bit shifting on the following numbers
	 * 2, 9, 17, 88
	 * 
	 * @param decmailNum -> represents the int input to be converted to binary and have its binary shifted
	 * @param numLeftShift -> the number of times the binary will be shifted. In this case this is always 1,
	 * 						  but there is functionality for further shifting if needed
	 */
	
	public static void binaryLeftShift(int decimalNum, int numLeftShift) {
		System.out.println("Bit Shift Left Example");
		int x = decimalNum;
		System.out.printf("Int decimal value: %d\n", x);
		System.out.println("Binary value: " + Integer.toBinaryString(x) + "\n");
		x = (x << numLeftShift);
		/**
		 * prediction: 2, 18, 34, 176
		 */
		System.out.printf("Int decimal value shifted left %d: %d\n", numLeftShift, x);
		System.out.println("Binary value shifted : " + Integer.toBinaryString(x));
		printOutputSeperator();
	}
	
	
	/**
	 * demonstrate right bit shifting on the following numbers
	 * 150, 225, 1555, 32456
	 * 
	 * @param decmailNum -> represents the int input to be converted to binary and have its binary shifted
	 * @param numRightShift -> the number of times the binary will be shifted. In this case this is always 2,
	 * 						  but there is functionality for further shifting if needed
	 */
	public static void binaryRightShift(int decimalNum, int numRightShift) {
		System.out.println("Bit Shift Right Example\n");

		int x = decimalNum;
		System.out.printf("Int decimal value: %d\n", x);
		System.out.println("Binary value: " + Integer.toBinaryString(x) + "\n");
		x = (x >> numRightShift);
		/**
		 * prediction: 37, 56, 388, 8114
		 */
		System.out.printf("Int decimal value shifted right %d: %d\n", numRightShift, x);
		System.out.println("Binary value shifted : " + Integer.toBinaryString(x));
		printOutputSeperator();
	}
	
	/**
	 * bitwise AND
	 * bitwise OR
	 * examples
	 */
	public static void bitwiseExample() {
		System.out.println("Bitwise Operators Example\n");
		int x, y, z;
		x = 7;
		y = 17;
		z = (x&y);
		/**
		 * bitwise prediction: 1
		 */
		System.out.printf("%d&%d = %s\n", x, y, z);
		
		z = (x|y);
		/**
		 * bitwise prediction: 23
		 */
		System.out.printf("%d|%d = %s\n", x, y, z);
		printOutputSeperator();

	}
	
	public static void prefixPostfixExample() {
		System.out.println("Prefix and Postfix Example\n");
		for(int i=0; i<10 ; i++) {
			System.out.printf("i value: %d\n", i);
			System.out.printf("prefix: %d\n", ++i);
			System.out.printf("postfix: %d\n", i++);
			System.out.printf("i: %d\n\n", i);
		}
		printOutputSeperator();
		
	}
	
	/**
	 * increment a variable by one in three ways
	 * print it out before and after each increment
	 * 
	 */
	public static void incrementExample() {
		System.out.println("Increment Example\n");
		for(int i=0; i<=3 ; i++) {
			System.out.printf("i value: %d\n", i);
			System.out.printf("prefix: %d\n", ++i);
			System.out.printf("i value: %d\n", i);
			System.out.printf("postfix: %d\n", i++);
			System.out.printf("i value: %d\n", i);
			i += 1;
			System.out.printf("i value += 1: %d\n", i);
		}
		printOutputSeperator();
		
	}
	
	/**
	 * find sum of two integers using prefix and postfix
	 * print the result
	 */
	public static void prefixPostfixSum() {
		System.out.println("Prefix Postfix Sum Example");
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println(sum);
		

//		int x = 5;
//		int y = 8;
//		int sum = x++ + y;
//		System.out.println(sum);
		printOutputSeperator();

	}
	
	public static void main(String[] args) {
		binaryLeftShift(2, 1);
		binaryLeftShift(18, 1);
		binaryLeftShift(34, 1);
		binaryLeftShift(176, 1);
		
		binaryRightShift(150, 2);
		binaryRightShift(225, 2);
		binaryRightShift(1555, 2);
		binaryRightShift(32456, 2);
		
		bitwiseExample();
		
		prefixPostfixExample();
		
		incrementExample();

		prefixPostfixSum();
	}

}
