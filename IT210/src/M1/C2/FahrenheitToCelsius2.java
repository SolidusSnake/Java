package M1.C2;
import java.util.Scanner;

public class FahrenheitToCelsius2
{
	public static void main(String[] args)
	{
		double fahrenheit;
		double celsius;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Fahrenheit value: ");
		fahrenheit = input.nextDouble();

		celsius = (fahrenheit - 32.0) * (5.0/9);
		celsius = celsius * 100.0;
		double roundedAnswer = Math.round(celsius);
		celsius = roundedAnswer / 100.0;

		System.out.println("Fahrenheit value is " + fahrenheit);
		System.out.println("Celsius value is " + celsius);
	}
}