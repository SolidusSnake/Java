/*
	* File:   UseCarRental.java
	* Desc:   Takes customer information and calculates rental prices
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;
import java.util.*;

public class UseCarRental
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nEnter your name: ");
		String customerName = keyboard.nextLine();

		System.out.print("Enter your zip code: ");
		int customerZip = keyboard.nextInt();

		System.out.print("Enter rental duration (in days): ");
		int rentalDuration = keyboard.nextInt();

		System.out.print("\nAVAILABLE MODELS");
		System.out.print("\n\t[1] Economy");
		System.out.print("\n\t[2] Mid-size");
		System.out.print("\n\t[3] Full-size");
		System.out.print("\n\t[4] Luxury");

		System.out.print("\n\nEnter requested model: ");
		int rentalCarSize = keyboard.nextInt();

		if (rentalCarSize == 4)
		{
			System.out.print("Would you like a chauffeur?");
			System.out.print("\n\t[1] Yes");
			System.out.print("\n\t[2] No");
			System.out.print("\n\n\t-> ");
			int rentalChauffeur = keyboard.nextInt();

			if (rentalChauffeur == 1)
			{
				LuxuryCarRental newLuxRental = new LuxuryCarRental(customerName, customerZip, rentalDuration, rentalCarSize);
				newLuxRental.display();
			}
			else
			{
				CarRental newLuxRental = new CarRental(customerName, customerZip, rentalDuration, rentalCarSize);
				newLuxRental.display();
			}
		}
		else
		{
			CarRental newRental = new CarRental(customerName, customerZip, rentalDuration, rentalCarSize);
			newRental.display();
		}
	}
}