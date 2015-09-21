/*
	* File:   Student.java
	* Desc:   'Student' class; contains methods to assign and retrieve field values; method to calculate GPA
	* Author: Wesley Tomlinson
	* Class:  IT210 / M2A1
*/
package M2;

public class Student
{
	private int studentID;
	private int creditHoursEarned;
	private int pointsEarned;
	private double gradePointAverage;

	public Student()
	{
		this.studentID = 9999;
		this.creditHoursEarned = 3;
		this.pointsEarned = 12;
	}

	public void setStudentID(int id)
	{
		studentID = id;
	}

	public int getStudentID()
	{
		return studentID;
	}

	public void setCreditHoursEarned(int cred)
	{
		creditHoursEarned = cred;
	}

	public int getCreditHoursEarned()
	{
		return creditHoursEarned;
	}

	public void setPointsEarned(int points)
	{
		pointsEarned = points;
	}

	public int getPointsEarned()
	{
		return pointsEarned;
	}

	public void setGradePointAverage()
	{
		gradePointAverage = pointsEarned / creditHoursEarned;
	}

	public double getGradePointAverage()
	{
		return gradePointAverage;
	}

	public void showStudentDetails()
	{
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Credit hours earned: " + getCreditHoursEarned());
		System.out.println("Number of points earned: " + getPointsEarned());
		System.out.println("Grade point average: " + getGradePointAverage());
	}
}