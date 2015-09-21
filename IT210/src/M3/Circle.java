/*
	* File:   Circle.java
	* Desc:   'Circle' class; contains methods to assign and retrieve field values for a circle's radius, diameter, and area
	* Author: Wesley Tomlinson
	* Class:  IT210 / M3A1
*/
package M3;

public class Circle
{
	private double radius;
	private double diameter;
	private double area;

	public Circle()
	{
		this.radius = 1.0;
		this.diameter = radius * 2;
		this.area = Math.PI * ((Math.pow(radius, 2)));
	}

	public void setRadius(double rad)
	{
		radius = rad;
		diameter = radius * 2;
		area = Math.PI * ((Math.pow(radius, 2)));
	}

	public double getRadius()
	{
		return radius;
	}

	public void showCircleValues()
	{
		System.out.println("RADIUS: " + getRadius());
		System.out.println("DIAMETER: " + diameter);
		System.out.println("AREA: " + area);
	}
}