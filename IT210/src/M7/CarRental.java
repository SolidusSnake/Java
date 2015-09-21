/*
	* File:   CarRental.java
	* Desc:   'CarRental' class; creates constructor and gets various information; displays information
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;

public class CarRental
{
	protected String customerName;
	protected int customerZip;
	protected int rentalCarSize;
	protected double rentalFeePerDay;
	protected int rentalDuration;
	protected double rentalFeeChauffeur;

	public CarRental(String name, int zipCode, int days, int carSize)
	{
		customerName = name;
		customerZip = zipCode;
		rentalCarSize = carSize;
		rentalDuration = days;

		getRentalFeePerDay(carSize);
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public int getCustomerZip()
	{
		return customerZip;
	}

	public int getRentalCarSize()
	{
		return rentalCarSize;
	}

	public double getRentalFeeChauffeur()
	{
		rentalFeeChauffeur = 200.00;
		double chauffeurTotal = (rentalFeeChauffeur * rentalDuration) + (rentalDuration * rentalFeePerDay);
		return chauffeurTotal;
	}

	public double getRentalFeeTotal()
	{
		double total = rentalDuration * rentalFeePerDay;
		return total;
	}

	public double getRentalFeePerDay(int rentalCarSize)
	{
		switch (rentalCarSize)
		{
			case 1:
				rentalFeePerDay = 29.99;
				break;
			case 2:
				rentalFeePerDay = 38.99;
				break;
			case 3:
				rentalFeePerDay = 43.50;
				break;
			case 4:
				rentalFeePerDay = 79.99;
				break;
		}

		return rentalFeePerDay;
	}

	public void display()
	{
		System.out.println("CUSTOMER INFORMATION");
		System.out.println("\t-> Name:  " + getCustomerName());
		System.out.println("\t-> Zip Code:  " + getCustomerZip());
		System.out.println("\t-> Car Size:  " + getRentalCarSize());
		System.out.println("\t-> Rental Fee: $" + rentalFeePerDay + " per day");
		System.out.println("\t-> Rental Duration: " + rentalDuration + " days");
		System.out.println(String.format("\t-> Total Fee: $%.2f",getRentalFeeTotal()));
	}
}