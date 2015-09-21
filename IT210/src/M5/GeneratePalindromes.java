/*
	* File:   GeneratePalindromes.java
	* Desc:   Generates all five digit palindrome numbers
	* Author: Wesley Tomlinson
	* Class:  IT210 / M5A1
*/
package M5;

public class GeneratePalindromes
{
	public static void main(String[] args)
	{
		int minLimit = 10000;
		int maxLimit = 99999;

		String outString;
		for(int i = minLimit; i <= maxLimit; ++i)
		{
			outString = String.valueOf(i);

			//check if 1st and 5th characters match, then check if 2nd and 4th characters match
			if(outString.charAt(0) == outString.charAt(4) && outString.charAt(1) == outString.charAt(3))
			{
				System.out.println(i);
			}
		}
	}
}