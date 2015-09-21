/*
	* File:   FahrenheitToCelsius.java
	* Desc:   Converts Fahrenheit to Celsius
	* Author: Wesley Tomlinson
	* Class:  IT210 / M1A1
*/
package M1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		double fahrenheit;
		double celsius;
		DecimalFormat bigCel = new DecimalFormat("#.##");
		DecimalFormat bigFah = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Fahrenheit value: ");
		fahrenheit = input.nextDouble();

		celsius = (fahrenheit - 32.0) * (5.0/9.0);

		System.out.println("Fahrenheit value is " + (bigFah.format(fahrenheit)));
		System.out.println("Celsius value is " + (bigCel.format(celsius)));
	}
}