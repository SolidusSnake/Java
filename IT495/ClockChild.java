/*
    * File:     ClockChild.java
    * Desc:     Child class of Clock
    * Author:   Wesley Tomlinson
    * Class:    IT495 / M2A1
*/

public class ClockChild extends Clock
{
    public int type;

    public ClockChild()
    {
        setTime(23, 30, 30);
    }

    public ClockChild (int hours, int minutes, int seconds)
    {
        setTime(11, 30, 30);
    }

    public void printTime(int typeOfClock)
    {
        type = typeOfClock;
        if (typeOfClock == 24)
        {
            setTime(23, 30, 30);
            super.printTime();
        }
        if (typeOfClock == 12)
        {
            setTime(11, 30, 30);
            this.printTime();
        }
    }
}
