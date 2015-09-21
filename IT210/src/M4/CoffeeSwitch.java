package M4;
import java.util.Scanner;

public class CoffeeSwitch
{
	public static void main(String[] args)
	{
		int item01 = 0;
		int item02 = 0;
		int item03 = 0;
		float totalBill = 0.0f;

		displayMenu();
		purchaseCoffee(item01, item02, item03, totalBill);
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
	}

	public static void purchaseCoffee(int item01, int item02, int item03, float totalBill)
	{
		Scanner input = new Scanner(System.in);
		int menuSelection;

		System.out.print("Please select item number: ");
		menuSelection = input.nextInt();

		switch (menuSelection)
		{
			case 0:
				System.out.println();

				if (item01 > 0 || item02 > 0 || item03 > 0)
					System.out.println("You ordered: ");

				if (item01 > 0)
					System.out.printf("%d x American:  $%.2f\n", item01, item01 * 1.99);

				if (item02 > 0)
					System.out.printf("%d x Espresso:  $%.2f\n", item02, item02 * 2.50);

				if (item03 > 0)
					System.out.printf("%d x Latte:     $%.2f\n", item03, item03 * 2.15);

				System.out.printf("Total bill:    $%.2f", totalBill);
				break;

			case 1:
				purchaseCoffee(++item01, item02, item03, totalBill + 1.99f);
				break;

			case 2:
				purchaseCoffee(item01, ++item02, item03, totalBill + 2.50f);
				break;

			case 3:
				purchaseCoffee(item01, item02, ++item03, totalBill + 2.15f);
				break;

			default:
				System.out.println("ERROR: " + menuSelection + " is not a valid choice.");
				purchaseCoffee(item01, item02, item03, totalBill);
				break;
		}
	}
}