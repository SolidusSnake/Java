/*
	* File:   LuxuryCarRental.java
	* Desc:   'LuxuryCarRental' class; child of CarRental class; option to include chauffeur with rental
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;

public class LuxuryCarRental extends CarRental
{
	public LuxuryCarRental(String name, int zipCode, int days, int carSize)
	{
		super(name, zipCode, days, carSize);
	}

	@Override
	public void display()
	{
		System.out.println("CUSTOMER INFORMATION");
		System.out.println("\t-> Name:  " + getCustomerName());
		System.out.println("\t-> Zip Code:  " + getCustomerZip());
		System.out.println("\t-> Car Size:  " + getRentalCarSize());
		System.out.println("\t-> Rental Fee: $" + rentalFeePerDay + " per day");
		System.out.println("\t-> Chauffeur Fee: $200 per day");
		System.out.println("\t-> Rental Duration: " + rentalDuration + " days");
		System.out.println(String.format("\t-> Total Fee: $%.2f",getRentalFeeChauffeur()));
	}
}