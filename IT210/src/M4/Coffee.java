/*
	* File:   Coffee.java
	* Desc:   Lists coffee prices, then adds total menu selections
	* Author: Wesley Tomlinson
	* Class:  IT210 / M4A1
*/
package M4;
import java.util.Scanner;

public class Coffee
{
	public static int menuChoice;
	public static final int AMERICAN_OPT = 1;
	public static final int ESPRESSO_OPT = 2;
	public static final int LATTE_OPT = 3;
	public static final double AMERICAN_PRICE = 1.99;
	public static final double ESPRESSO_PRICE = 2.50;
	public static final double LATTE_PRICE = 2.15;
	public static double firstBill = 0;
	public static double secondBill = 0;
	public static double thirdBill = 0;

	public static void main(String[] args)
	{
		firstSelection();
		secondSelection();
		thirdSelection();

		//System.out.println("Your total bill is " + (firstBill + secondBill + thirdBill));
		System.out.printf("Your total bill is: $%.2f", (firstBill + secondBill + thirdBill));
	}

	public static void displayMenu()
	{
		System.out.println(" ______________________ ");
		System.out.println("|     COFFEE STORE     |");
		System.out.println("|______________________|");
		System.out.println("| (1) American | $1.99 |");
		System.out.println("|______________|_______|");
		System.out.println("| (2) Espresso | $2.50 |");
		System.out.println("|______________|_______|");
		System.out.println("| (3) Latte    | $2.15 |");
		System.out.println("|______________|_______|");
		System.out.println("| (0) EXIT     | $0.00 |");
		System.out.println("|______________________|\n");
		System.out.print("Please select item number: ");
		Scanner input = new Scanner(System.in);
		menuChoice = input.nextInt();
	}

	public static double firstSelection()
	{
		displayMenu();
		if (menuChoice == AMERICAN_OPT)
		{
			firstBill = firstBill + AMERICAN_PRICE;
		}
		else
		if (menuChoice == ESPRESSO_OPT)
		{
			firstBill = firstBill + ESPRESSO_PRICE;
		}
		else
		if (menuChoice == LATTE_OPT)
		{
			firstBill = firstBill + LATTE_PRICE;
		}
		else
		if (menuChoice < 0 || menuChoice > 3)
		{
			firstBill = 0;
		}

		System.out.printf("Your selection will cost: $%.2f\n", firstBill);
		return firstBill;
	}

	public static double secondSelection()
	{
		displayMenu();
		if (menuChoice == AMERICAN_OPT)
		{
			secondBill = secondBill + AMERICAN_PRICE;
		}
		else
		if (menuChoice == ESPRESSO_OPT)
		{
			secondBill = secondBill + ESPRESSO_PRICE;
		}
		else
		if (menuChoice == LATTE_OPT)
		{
			secondBill = secondBill + LATTE_PRICE;
		}
		else
		if (menuChoice < 0 || menuChoice > 3)
		{
			secondBill = 0;
		}

		System.out.printf("Your selection will cost: $%.2f\n", secondBill);
		return secondBill;
	}

	public static double thirdSelection()
	{
		displayMenu();
		if (menuChoice == AMERICAN_OPT)
		{
			thirdBill = thirdBill + AMERICAN_PRICE;
		}
		else
		if (menuChoice == ESPRESSO_OPT)
		{
			thirdBill = thirdBill + ESPRESSO_PRICE;
		}
		else
		if (menuChoice == LATTE_OPT)
		{
			thirdBill = thirdBill + LATTE_PRICE;
		}
		else
		if (menuChoice < 0 || menuChoice > 3)
		{
			thirdBill = 0;
		}

		System.out.printf("Your selection will cost: $%.2f\n", thirdBill);
		return thirdBill;
	}
}