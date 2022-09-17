package com.ProjectManagement;

import java.util.ArrayList;

public class Project {
private int projectId;
private String projectTitle;
//private Project project;

public void setData(int projectId,String projectTitle)
{
	this.projectId=projectId;
	this.projectTitle=projectTitle;
	
}
public int getId()
{
	return this.projectId;
}
public void displayData()
{
	System.out.println( "The project ID is---> "+projectId);
	System.out.println( "The project Title is---> "+projectTitle);
}
public boolean equals(Project p)
{
	return false;
}
}
