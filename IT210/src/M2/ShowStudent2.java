/*
	* File:   ShowStudent2.java
	* Desc:   Demonstrates constructor functionality for 'Student' class; shows assigned default values
	* Author: Wesley Tomlinson
	* Class:  IT210 / M2A1
*/
package M2;

public class ShowStudent2
{
	public static void main(String[] args)
	{
		Student LisaSimpson = new Student();
		LisaSimpson.setGradePointAverage();
		LisaSimpson.showStudentDetails();
	}
}