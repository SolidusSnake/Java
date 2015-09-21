/*
	* File:   DemoCandles.java
	* Desc:   Inputs selected candle colors, heights, and scent; displays selected information and prices;
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;
import java.util.*;

public class DemoCandles
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Candle boringCandle = new Candle();
		ScentedCandle awesomeCandle = new ScentedCandle();

		System.out.print("\nEnter the boring candle's color: ");
		boringCandle.setColor(keyboard.next());

		System.out.print("Enter the boring candle's height (INCHES): ");
		boringCandle.setHeight(keyboard.nextDouble());

		System.out.print("\nEnter the awesome candle's color: ");
		awesomeCandle.setColor(keyboard.next());

		System.out.print("Enter the awesome candle's height (INCHES): ");
		awesomeCandle.setHeight(keyboard.nextDouble());

		System.out.print("Enter the awesome candle's scent: ");
		keyboard.nextLine();
		awesomeCandle.setScent(keyboard.nextLine());

		System.out.println("\nBORING CANDLE");
		System.out.println("\t-> Color  :  " + boringCandle.getColor());
		System.out.println("\t-> Height :  " + boringCandle.getHeight());
		System.out.println("\t-> Price  :  $" + boringCandle.getPrice());

		System.out.println("\nAWESOME CANDLE");
		System.out.println("\t-> Color  :  " + awesomeCandle.getColor());
		System.out.println("\t-> Height :  " + awesomeCandle.getHeight());
		System.out.println("\t-> Scent  :  " + awesomeCandle.getScent());
		System.out.println("\t-> Price  :  $" + awesomeCandle.getPrice());
	}
}