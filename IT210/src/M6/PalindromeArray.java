/*
	* File:   PalindromeArray.java
	* Desc:   Generates 25 random palindromes and counts how many are odd and even
	* Author: Wesley Tomlinson
	* Class:  IT210 / M6A1
*/
package M6;
import java.util.Random;

public class PalindromeArray
{
	public static void main(String args[])
	{
		int arr[] = new int[25];
		int pos[] = new int[5];
		int evenCount = 0;

		for(int i = 0; i < 25; i++) {

			pos[0] = (int)(Math.random() * 10);
			pos[1] = (int)(Math.random() * 10);
			pos[2] = (int)(Math.random() * 10);
			pos[3] = pos[1];
			pos[4] = pos[0];

			arr[i] = (pos[0] * 10000) + (pos[1] * 1000) + (pos[2] * 100) + (pos[3] * 10) + pos[4];

			System.out.printf("%05d\n", arr[i]); // IF NUMBER < 5 DIGITS, PAD THE LEFT WITH ZEROS

			if ((pos[4] % 2) == 0)
				evenCount++;
		}

		System.out.printf("\n%d are even.\n", evenCount);
		System.out.printf("%d are odd.\n", 25 - evenCount);
	}
}