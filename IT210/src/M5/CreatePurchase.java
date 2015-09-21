/*
	* File:   CreatePurchase.java
	* Desc:   Prompts user for purchase details, checking for a specific range of numbers before continuing loop
	* Author: Wesley Tomlinson
	* Class:  IT210 / M5A1
*/
package M5;
import java.util.Scanner;

public class CreatePurchase
{
	public static void main(String[] args)
	{
		int invoiceNum = 0;
		double saleAmt = 0.00;
		Purchase goods = new Purchase();
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your invoice number.\nThis number must be between 1000 and 8000.\n  >> ");
		invoiceNum = input.nextInt();

		while((invoiceNum < 1000) || (invoiceNum > 8000))
		{
			System.out.println("ERROR: INVALID_NUMBER");
			System.out.print("Please remember, the number must be between 1000 and 8000.\n  >> ");
			invoiceNum = input.nextInt();
		}

		System.out.print("Please enter the sale amount:\n  >> $");
		saleAmt = input.nextDouble();

		while(saleAmt < 0)
		{
			System.out.println("ERROR: INVALID_NUMBER");
			System.out.print("Please be advised, the sale amount must be greater than 0.00.\n  >> $");
			saleAmt = input.nextDouble();
		}

		goods.setInvoiceNum(invoiceNum);
		goods.setSaleAmt(saleAmt);
		goods.showPurchase();
	}
}