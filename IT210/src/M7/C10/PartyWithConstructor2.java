package M7.C10;

public class PartyWithConstructor2
{
	private int guests;

	public PartyWithConstructor2(int numGuests)
	{
		//System.out.println("Creating a party");
		guests = numGuests;
	}

	public int getGuests()
	{
		return guests;
	}

	public void setGuests(int numGuests)
	{
		guests = numGuests;
	}

	public void displayInvitation()
	{
		System.out.println("Please come to my party!");
	}
}