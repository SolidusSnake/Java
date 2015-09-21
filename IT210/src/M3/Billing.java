/*
	* File:   Billing.java
	* Desc:   'Billing' class; computes single book price (plus tax), multiple books (plus tax),
	 		  and multiple books with a discount percentage (plus tax)
	* Author: Wesley Tomlinson
	* Class:  IT210 / M3A1
*/
package M3;

public class Billing
{
	private static final double SALES_TAX = 0.08;
	private static double bookPrice;
	private static int bookQuantity;

	public static void main(String[] args)
	{
		computeBill(55);
		computeBill(55,10);
		computeBill(55, 10, 0.25);
	}

	public static void computeBill(double price)
	{
		bookPrice = price;
		double totalCost = (bookPrice * SALES_TAX) + bookPrice;
		System.out.println("The total cost of a single photo book (plus taxes) is $" + totalCost);
	}

	public static void computeBill(double price, int quantity)
	{
		bookPrice = price;
		bookQuantity = quantity;
		double totalCost = ((bookPrice * bookQuantity) * SALES_TAX) + (bookPrice * bookQuantity);
		System.out.println("The total cost for " + quantity + " photo books (plus taxes) is $" + totalCost);
	}

	public static void computeBill(double price, int quantity, double coupon)
	{
		bookPrice = price;
		bookQuantity = quantity;
		double discountAmt = (bookPrice * bookQuantity) * coupon;
		double preTaxAmt = ((bookPrice * bookQuantity) - discountAmt);
		double totalCost = (preTaxAmt * SALES_TAX) + preTaxAmt;
		System.out.println("The total cost for " + quantity + " photo books with a %25 off coupon (plus taxes) is $" + totalCost);
	}
}