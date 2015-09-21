/*
	* File:   Purchase.java
	* Desc:   'Purchase' class for setting sale amount, calculating sales tax, and displaying purchase information
	* Author: Wesley Tomlinson
	* Class:  IT210 / M5A1
*/
package M5;

public class Purchase
{
	int invoiceNum = 0;
	double saleAmt = 0.00;
	double taxVal;
	double totalCost;

	public void setInvoiceNum(int invoice)
	{
		invoiceNum = invoice;
	}

	public void setSaleAmt(double saleVal)
	{
		saleAmt = saleVal;
		taxVal = (saleAmt * 0.05);
		totalCost = taxVal + saleAmt;
	}

	public void showPurchase()
	{
		System.out.println("\nINVOICE: " + invoiceNum);
		System.out.println("ITEM COST: $" + saleAmt);
		System.out.println("TAX AMOUNT: $" + (float) taxVal);
		System.out.println("FINAL COST: $" + totalCost);
	}
}