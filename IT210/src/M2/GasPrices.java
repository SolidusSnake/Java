/*
	* File:   GasPrices.java
	* Desc:   Takes price of gas per barrel and displays cost per gallon range
	* Author: Wesley Tomlinson
	* Class:  IT210 / M2A1
*/
package M2;
import java.util.Scanner;

public class GasPrices
{
	public static void main(String[] args)
	{
		int pricePerBarrel;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nEnter the current price of gasoline per barrel (in $): ");
		pricePerBarrel = keyboard.nextInt();
		ShowPrices(pricePerBarrel);
	}

	public static void ShowPrices(int pricePerBarrel)
	{
		float pumpMin = (float) (pricePerBarrel * 0.035);
		float pumpMax = (float) (pricePerBarrel * 0.04);

		// %d prints [int] var as is; %.2f prints [float] var up to 2 decimal digits;
		System.out.println(String.format("\nAt $%d per barrel, gas prices at the pump will range from $%.2f to $%.2f per gallon.",
				pricePerBarrel, pumpMin, pumpMax));
	}
}