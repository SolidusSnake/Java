/*
	* File:   TestPalindrome.java
	* Desc:   Checks to see if an integer is a palindrome
	* Author: Wesley Tomlinson
	* Class:  IT210 / M4A1
*/
package M4;
import java.util.Scanner;

public class TestPalindrome
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		if (isPalindrome(integer))
		{
			System.out.print(integer + " is a palindrome.\n");
		}
		else
		{
			System.out.print(integer + " is not a palindrome.\n");
		}

	}

	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}

	public static int reverse(int number)
	{
		int reverse = 0;

		while (number != 0)
		{
			int lastNum = number % 10;
			reverse = reverse * 10 + lastNum;
			number = number / 10;
		}

		return reverse;
	}
}