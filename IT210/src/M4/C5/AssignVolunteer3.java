package M4.C5;

import java.util.Scanner;
public class AssignVolunteer3
{
	public static void main(String[] args)
	{
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else: ");
		donationType = input.nextInt();

		if ((donationType == CLOTHING_CODE) || (donationType == OTHER_CODE))
		{
			if (donationType == CLOTHING_CODE)
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation.";
			}
			else
			{
				volunteer = OTHER_PRICER;
				message = "another donation type.";
			}
		}
		else
		{
			volunteer = "not available.";
			message = "an invalid donation type.";
		}

		System.out.println("\nYou entered " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}
}