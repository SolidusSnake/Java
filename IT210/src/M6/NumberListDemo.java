/*
	* File:   NumberListDemo.java
	* Desc:   Creates random 8 integer array; displays all integers, reversed order,
	*         sum of integers, all values less than 5, lowest value, highest value,
	*         average of values, and all values higher than the average
	* Author: Wesley Tomlinson
	* Class:  IT210 / M6A1
*/
package M6;
import java.util.Random;

public class NumberListDemo
{
	public static void main(String[] args)
	{
		int[] randArray = new int[8];
		Random rand = new Random();

		for (int i = 0; i < randArray.length; i++)
		{
			int n = rand.nextInt(100); // GENERATE RANDOM NUMBER UP TO 100
			randArray[i] = n;
		}

		//(1) DISPLAY INITIAL ARRAY
		System.out.print("INITIAL ARRAY :  ");
		for (int i = 0; i < randArray.length; ++i)
		{
			System.out.printf("%02d  ", randArray[i]);
		}

		//(2) DISPLAY THE ARRAY IN REVERSE
		System.out.print("\nREVERSE ARRAY :  ");
		for (int i = 0; i < randArray.length; ++i)
		{
			int decrease = randArray.length - i - 1;
			System.out.printf("%02d  ", randArray[decrease]);
		}

		//(3) DISPLAY THE SUM OF THE ARRAY
		int sum = 0;
		System.out.print("\nSUM OF VALUES :  ");
		for (int i = 0; i < randArray.length; ++i)
		{
			sum += randArray[i];
		}
		System.out.println(sum);

		//(4) DISPLAY VALUES THAT ARE LESS THAN 5
		System.out.print("VALUES  <  5  :  ");
		for (int i = 0; i < randArray.length; ++i)
		{
			if (randArray[i] < 5)
			{
				System.out.printf("%02d  ", randArray[i]);
			}
		}

		//(5) DISPLAY LOWEST VALUE
		System.out.print("\nLOWEST VALUE  :  ");
		int low = randArray[0];
		for (int i = 0; i < randArray.length; ++i)
		{
			if (low > randArray[i])
			{
				low = randArray[i];
			}
		}
		System.out.printf("%02d", low);

		//(6) DISPLAY HIGHEST VALUE
		System.out.print("\nHIGHEST VALUE :  ");
		int high = randArray[0];
		for (int i = 0; i < randArray.length; ++i)
		{
			if (high < randArray[i]) {
				high = randArray[i];
			}
		}
		System.out.printf("%02d", high);

		//(7) CALCULATE AND DISPLAY AVERAGE
		System.out.print("\nAVERAGE VALUE :  ");
		sum = 0;
		int average;
		for (int i = 0; i < randArray.length; ++i)
		{
			sum += randArray[i];
		}
		average = sum / randArray.length;
		System.out.printf("%02d", average);

		//(8) DISPLAY ALL VALUES HIGHER THAN THE CALCULATED AVERAGE
		System.out.print("\nVALUES > AVG  :  ");
		for (int i = 0; i < randArray.length; ++i)
		{
			if (randArray[i] > average) {
				System.out.printf("%02d  ", randArray[i]);
			}
		}
		System.out.println();
	}
}
