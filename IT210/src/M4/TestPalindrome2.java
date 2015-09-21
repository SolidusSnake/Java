/*
	* File:   TestPalindrome2.java
	* Desc:   //////////////'TestPalindrome' class; contains methods to assign and retrieve field values for a circle's radius, diameter, and area
	* Author: Wesley Tomlinson
	* Class:  IT210 / M4A1
*/
package M4;
import java.util.Scanner;

public class TestPalindrome2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		int number = input.nextInt();

		System.out.println(checkIntPalindrome(number));
		System.out.println(reverse(number));
	}

	public static String checkIntPalindrome(int number)
	{
		if (number == reverse(number))
		{
			return "The integer is a palindrome.";
		}
		else
		{
			return "The integer is not a palindrome.";
		}
	}

	public static int reverse(int number)
	{
		int reverse = 0;
		int remainder = 0;

		while (number > 0)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		return reverse;
	}
}