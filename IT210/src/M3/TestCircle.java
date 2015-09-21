/*
	* File:   TestCircle.java
	* Desc:   Demonstrates constructor functionality for 'Circle' class; instantiates an object and assigns values
	* Author: Wesley Tomlinson
	* Class:  IT210 / M3A1
*/
package M3;

public class TestCircle
{
	public static void main(String[] args)
	{
		Circle Circle01 = new Circle();
		Circle Circle02 = new Circle();
		Circle Circle03 = new Circle();
		Circle01.setRadius(15);
		Circle02.setRadius(125);

		System.out.println("The values for Circle01 are listed below: ");
		Circle01.showCircleValues();
		System.out.println("\nThe values for Circle02 are listed below: ");
		Circle02.showCircleValues();
		System.out.println("\nThe values for Circle03 are listed below: ");
		Circle03.showCircleValues();
	}
}