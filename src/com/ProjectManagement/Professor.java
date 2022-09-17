package com.ProjectManagement;

import java.util.ArrayList;

public class Professor {
private int professorId;
private String professorName;
private ArrayList<Student> stud;
public Professor() {
	
}
public void setData(int professorId,String professorName)
{
	this.professorId=professorId;
	this.professorName=professorName;
}
public void displayData()
{
	System.out.println( "The professor ID is---> "+professorId);
	System.out.println( "The professor Name is---> "+professorName);
	
	//display if any arraylist is created
}
public boolean equals(Professor p)
{
	return false;
}
public void assignStudents(Student s) {
	
}
}
