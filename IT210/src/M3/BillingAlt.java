/*
	* File:   Billing.java
	* Desc:   'Billing' class; ************
	* Author: Wesley Tomlinson
	* Class:  IT210 / M3A1
*/
package M3;

public class BillingAlt
{
	static double tax = 0.08;

	public static void main(String[] args)
	{
		computeBill(50);
		computeBill(50,10);
		computeBill(50, 10, 0.25);
	}

	public static void computeBill(double price)
	{
		double taxAmt = price * tax;
		System.out.println("The price of a single photo book is $" + price);
		System.out.println("The total tax amount is $" + taxAmt);
		System.out.println("The total cost of a single photo book is $" + (price + taxAmt));
	}

	public static void computeBill(double price, int quantity)
	{
		double taxAmt = (price * quantity) * tax;
		System.out.println("The total cost for " + quantity + " photo books is $" + ((price * quantity) + taxAmt));
	}

	public static void computeBill(double price, int quantity, double coupon)
	{
		double couponAmt = (quantity * price) * coupon;
		double discountPrice = ((quantity * price) - couponAmt);
		double taxAmt = discountPrice * tax;
		System.out.println("The total cost for " + quantity + " photo books with a %25 off coupon is $" + (discountPrice + taxAmt));
	}
}