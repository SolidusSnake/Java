/*
    * File:     Clock.java
    * Desc:     Clock class
    * Author:   Wesley Tomlinson
    * Class:    IT495 / M2A1
*/

public class Clock
{
    // store hours, minutes, seconds as integer
    public int hr;
    public int min;
    public int sec;

    // default constructor
    // hr = 0; min = 0; sec = 0;
    public Clock()
    {
        setTime(0, 0, 0);
    }

    // constructor with parameters, to set the time
    // hr = hours; min = minutes; sec = seconds;
    public Clock(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
    }

    // method to set the time
    // hr = hours; min = minutes; sec = seconds;
    public void setTime(int hours, int minutes, int seconds)
    {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;

        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;

        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    // method to return the hours
    public int getHours()
    {
        return hr;
    }

    // method to return minutes
    public int getMinutes()
    {
        return min;
    }

    // method to return seconds
    public int getSeconds()
    {
        return sec;
    }

    // method to print time in hh:mm:ss format
    public void printTime()
    {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");

        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");

        if (sec < 10)
            System.out.print("0");
        System.out.print(sec);
    }

    // method to increment by one sec
    // if before-increment time is 23:59:59, time is reset to 00:00:00
    public void incrementSeconds()
    {
        sec++;

        if (sec > 59)
        {
            sec = 0;
            incrementMinutes();
        }
    }

    // method to increment time by one min
    // if before-increment time is 23:59:53, time reset to 00:00:53
    public void incrementMinutes()
    {
        min++;

        if (min > 59)
        {
            min = 0;
            incrementHours();
        }
    }

    // method to increment time by one hour
    // if before-increment time is 23:45:53, time reset to 00:45:53
    public void incrementHours()
    {
        hr++;

        if (hr > 23)
        {
            hr = 0;
        }
    }

    public static void main(String[] args)
    {
        Clock firstClock = new Clock(9, 0, 0);
        Clock secondClock = new Clock(9, 30, 20);
        ClockChild parentClock = new ClockChild();
        ClockChild childClock = new ClockChild(23, 30, 30);

        // display firstClock
        System.out.print("\nfirstClock: ");
        firstClock.printTime();
        System.out.println();

        // display secondClock
        System.out.print("\nsecondClock: ");
        secondClock.printTime();
        System.out.println();

        // add 1 hour to firstClock
        System.out.print("\nfirstClock + 1 hour: ");
        firstClock.incrementHours();
        firstClock.printTime();
        System.out.println();

        // add 30 minutes to secondClock
        System.out.print("\nsecondClock + 30 min: ");
        secondClock.setTime(9,59,20);
        secondClock.incrementMinutes();
        secondClock.printTime();
        System.out.println();

        // type of clock based on parameters
        System.out.print("\nparentClock: ");
        parentClock.printTime(24);
        System.out.println();

        System.out.print("\nchildClock: ");
        childClock.printTime(12);
        System.out.println();
    }
}
