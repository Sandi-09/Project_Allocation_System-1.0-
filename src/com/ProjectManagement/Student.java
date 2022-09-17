package com.ProjectManagement;

public class Student {
	private int studentId;
	private String studentName;
	private Project project;
	private Professor professor;

	public void setData(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void displayData() {
		System.out.println("The student ID is---> " + studentId);
		System.out.println("The student Name is---> " + studentName);
	}

	public boolean equals(Student s) {
		return false;
	}

	public Project getProjectDetails() {
		// this.project=project;
		return project;
	}

	public Professor getProfessorDetails() {
		// this.project=project;
		return professor;
	}

	public void assignProject(Project proj) {

	}

	public void assignProfessor(Professor prof) {

	}
}