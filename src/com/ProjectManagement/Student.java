package com.ProjectManagement;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private Project project;
	private Professor professor;
	boolean isAssigned=false;

	public void setData(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void displayData() {
		System.out.println("The student ID is---> " + studentId);
		System.out.println("The student Name is---> " + studentName);
	}

	public boolean equals(ArrayList<Student> s) {
			if (s.size() == 0)
				return false;
			for (int i = 0; i < s.size(); i++) {
				Student comp = s.get(i);
				if (this.studentId == comp.studentId && this.studentName.equals(comp.studentName))
					return true;
			}
			return false;
		}
	

	public Project getProjectDetails(Project project) {
		this.project = project;
		return project;
	}

	public Professor getProfessorDetails(Professor professor) {
		this.professor = professor;
		return professor;
	}

	public void assignProject(Project proj) {
		this.project = proj;
		isAssigned = true;
		proj.displayData();
	}

	public void assignProfessor(Professor prof) {
		this.professor = prof;
	}
}