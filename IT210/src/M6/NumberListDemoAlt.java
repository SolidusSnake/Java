/*
	* File:   NumberListDemo.java
	* Desc:   *****************************
	* Author: Wesley Tomlinson
	* Class:  IT210 / M6A1
*/
package M6;

public class NumberListDemoAlt {
	public static void main(String[] args) {
		int[] eightIntegers = {1,2,3,7,37,57,63,79};

		// 1, display all the integers

		for (int i = 0; i < eightIntegers.length; ++i) {
			System.out.print(eightIntegers[i]+",");
		}

		System.out.println();

		// 2, display all the integers in reverse order

		for (int i = 0; i < eightIntegers.length; ++i) {
			int decrease = eightIntegers.length - i - 1;
			System.out.print(eightIntegers[decrease]+" ");
		}

		System.out.println();

		// 3, display the sum of the eight integers

		int sum = 0;

		for (int i = 0; i < eightIntegers.length; ++i) {
			sum += eightIntegers[i];
		}

		System.out.println(sum);

		// 4, display all values less than 5

		for (int i = 0; i < eightIntegers.length; ++i) {
			if (eightIntegers[i] < 5) {
				System.out.print(eightIntegers[i]+" ");
			}
		}

		System.out.println();

		// 5, display the lowest value

		int low = eightIntegers[0]; // does it matter what value goes here, as long as it's from the array?

		for (int i = 0; i < eightIntegers.length; ++i) {
			if (low > eightIntegers[i]) {
				low = eightIntegers[i];
			}
		}

		System.out.println(low);

		// 6, display the highest value

		int high = eightIntegers[0];

		for (int i = 0; i < eightIntegers.length; ++i) {
			if (high < eightIntegers[i]) {
				high = eightIntegers[i];
			}
		}

		System.out.println(high);

		// 7, display all the values that are higher than the calculated average value

		sum = 0;
		int average;

		for (int i = 0; i < eightIntegers.length; ++i) {
			sum += eightIntegers[i];
		}

		average = sum / eightIntegers.length;

		for (int i = 0; i < eightIntegers.length; ++i) {
			if (eightIntegers[i] > average) {
				System.out.print(eightIntegers[i]+" ");
			}
		}

	}
}
