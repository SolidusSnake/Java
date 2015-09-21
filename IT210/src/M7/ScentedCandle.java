/*
	* File:   ScentedCandle.java
	* Desc:   'ScentedCandle' class; sets and gets scent; overrides 'Candle' setHeight method
	* Author: Wesley Tomlinson
	* Class:  IT210 / M7A1
*/
package M7;

public class ScentedCandle extends Candle
{
	private String candleScent;

	public void setScent(String scent)
	{
		this.candleScent = scent;
	}

	public String getScent()
	{
		return this.candleScent;
	}

	@Override
	public void setHeight(double height)
	{
		super.candleHeight = height;
		super.candlePrice = height * 3.00;
	}
}