package com.perscholas.java_basics;
/**
 * 
 * @author caleb
 * @classSection 12-2022-JAVA
 * @instructor Ms. Lewis
 * @date 11/16/2022
 * @programOverview using variables to solve small practice problems
 *
 */
public class CoreJavaVariables {
	
	/**
	 * write program that declares 2 integer variables
	 * assign an integer to each
	 * add them together
	 * assign the sum to a variable
	 * print out the result
	 */
	public static void twoIntSum() {
		int num1 = 6;
		int num2 = 10;
		int sum = num1 + num2;
		System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
		
	}
	
	/**
	 * declare 2 double variables
	 * assign a number to each
	 * add them together
	 * assign the sum to a variable
	 * print out the result
	 */
	public static void twoDoubleSum() {
		double dub1 = 42.65D;
		double dub2 = 6326.9D;
		double sum = dub1 + dub2;
		System.out.printf("The sum of %.2f and %.2f is %.2f\n", dub1, dub2, sum);
		
	}
	
	/**
	 * declare an integer variable
	 * declare a double variable
	 * assign numbers to each
	 * add them together
	 * assign sum to a variable
	 */
	public static void intDoubleSum() {
		int int1 = 88;
		double dub1 = 43.98;
		double sum = int1 + dub1;
		System.out.printf("The sum of %d and %.2f is %.2f\n", int1, dub1, sum);

	}
	
	/**
	 * declare and initialize 2 integer variables
	 * divide larger integer by smaller integer
	 * assign result to a value
	 * print the result
	 * change bigger integer to a decimal
	 * make needed corrections
	 * corrections: change larger integer and sum to doubles
	 * 				change large integer and sum print format specifiers
	 */
	public static void twoIntQuotient() {
		double int1 = 124425253.6D;
		int int2 = 58203;
		double sum = int1 / int2;
		System.out.printf("The sum of %.2f and %d is %.2f\n", int1, int2, sum);

	}
	
	/**
	 * declare and init 2 double variables
	 * divide larger double by smaller
	 * assign result to a variable
	 * print out the result
	 * cast result to an integer
	 * print again
	 */
	public static void twoDoubleQuotient() {
		double dub1 = 134.25D;
		double dub2 = 124.67D;
		double sum = dub1 / dub2;
		System.out.printf("The sum of %.2f and %.2f is %.2f\n", dub1, dub2, sum);
		int int1 = (int) (dub1 / dub2);
		System.out.printf("The sum of %.2f and %.2f is %d\n", dub1, dub2, int1);

	}

	/**
	 * declare and init two ints, x and y
	 * x = 5, y = 6
	 * declare q = y/x
	 * print q
	 * cast y to double and assign to q
	 * print q again
	 */
	public static void xYQuotient() {
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.printf("q = %.2f\n", q);
		double d = Double.valueOf(y);
		q = d;
		System.out.printf("q = %.2f\n", q);

	}
	
	/**
	 * declare a named constant
	 * use it in calculation
	 * print result
	 */
	public static void useConstant() {
		final int MY_INT = 99;
		double result = (MY_INT * 8) / 14 + Math.pow(4, 9);
		System.out.printf("result: %.2f\n", result);
	}
	
	/**
	 * create 3 variables representing cafe items
	 * assign prices to each item
	 * create variables for subtotal and total sale amount
	 * complete an order for 3 of the first item
	 * 4 for the second item
	 * 2 of the third item
	 * calculate the subtotal
	 * create constant for SALES_TAX
	 * add SALES_TAX to subtotal = totalSale
	 * round to two decimal places
	 * @param numCoffee - # normal coffees ordered
	 * @param numColdBrew - # cold brews ordered
	 * @param numPastry - # pastries order
	 */
	public static void calcTotal(int numCoffee, int numColdBrew, int numPastry) {
		/**
		 * cafe items
		 */
		double coffeePrice = 4.99;
		double coldBrewPrice = 5.99;
		double pastryPrice = 3.99;
		/**
		 * sale calculation
		 */
		double subtotal;
		double totalSale;
		final double SALES_TAX = 2.13;
		
		/**
		 * subtotal calculation
		 */
		subtotal = (numCoffee * coffeePrice) + (numColdBrew * coldBrewPrice) + 
				(numPastry * pastryPrice);
		
		/**
		 * add sales tax to subtotal = total sale
		 */
		totalSale = subtotal + SALES_TAX;
		
		System.out.printf("You ordered %d coffees, %d cold brews, and %d pastries.\n", 
				numCoffee, numColdBrew, numPastry);
		System.out.printf("Total sale: %.2f", totalSale);
	}
	
	
	public static void main(String[] args) {
		twoIntSum();
		twoDoubleSum();
		intDoubleSum();
		twoIntQuotient();
		twoDoubleQuotient();
		xYQuotient();
		useConstant();
		calcTotal(3, 4, 2);
	}

}
