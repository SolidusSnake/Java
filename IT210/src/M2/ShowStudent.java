/*
	* File:   ShowStudent.java
	* Desc:   Demonstrates constructor functionality for 'Student' class; instantiates an object and assigns values
	* Author: Wesley Tomlinson
	* Class:  IT210 / M2A1
*/
package M2;

public class ShowStudent
{
	public static void main(String[] args)
	{
		Student BartSimpson = new Student();
		BartSimpson.setStudentID(8675309);
		BartSimpson.setCreditHoursEarned(18);
		BartSimpson.setPointsEarned(36);
		BartSimpson.setGradePointAverage();
		BartSimpson.showStudentDetails();
	}
}