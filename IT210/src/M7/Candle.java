/*
	* File:   Candle.java
	* Desc:   'Candle' class; sets color and height; gets color, height and price
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;

public class Candle
{
	private String candleColor;
	protected double candleHeight;
	protected double candlePrice;

	public void setColor(String color)
	{
		this.candleColor = color;
	}

	public String getColor()
	{
		return this.candleColor;
	}

	public void setHeight(double height)
	{
		this.candleHeight = height;
		this.candlePrice = height * 2.00;
	}

	public double getHeight()
	{
		return this.candleHeight;
	}

	public double getPrice()
	{
		return this.candlePrice;
	}
}