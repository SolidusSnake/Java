package M6;
import java.util.*;

class PalindromeArrayAlt
{
	public static void main(String args[])
	{
		int a[] = new int[25];
		int evenCount = 0;

		for(int i = 0; i < 25; i++) {
			int digit1 = (int)(Math.random() * 10);
			int digit2 = (int)(Math.random() * 10);
			int digit3 = (int)(Math.random() * 10);
			int digit4 = digit2;
			int digit5 = digit1;

			a[i] = digit1 * 10000 +
					digit2 *  1000 +
					digit3 *   100 +
					digit4 *    10 +
					digit5;

			System.out.printf("%05d\n", a[i]);

			if ((digit5 % 2) == 0)
				evenCount++;
		}
		System.out.printf("%10d are even.\n", evenCount);
		System.out.printf("%10d are odd.\n", 25 - evenCount);
	}
}