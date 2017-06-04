/*
	* File:   Student.java
	* Desc:   'Student' class; contains "get" and "set" methods;
	* Author: Wesley Tomlinson
	* Class:  IT360 / M3A1
*/

public class Student {
    // declare variables
    private String studName;
    private int timerAmt;

    // Student set method
    public void setStudName(String studName) {
        this.studName = studName;
    }

    // Student get method
    public String getStudName() {
        return studName;
    }

    // Timer set method
    public void setTimerAmt(int timerAmt) {
        this.timerAmt = timerAmt;
    }

    // Timer get method
    public int getTimerAmt() {
        return timerAmt;
    }
}