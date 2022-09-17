package com.ProjectManagement;

import java.util.ArrayList;

public class Professor {
	private int professorId;
	private String professorName;
	private Student stud;
	private static ArrayList<Student> studList = new ArrayList<>();

	public Professor() {

	}

	public void setData(int professorId, String professorName) {
		this.professorId = professorId;
		this.professorName = professorName;
	}

	public void displayData() {
		System.out.println("The professor ID is---> " + professorId);
		System.out.println("The professor Name is---> " + professorName);

		// display if any arraylist is created
	}

	public boolean equals(ArrayList<Professor> p) {
		if (p.size() == 0)
			return false;
		for (int i = 0; i < p.size(); i++) {
			Professor comp = p.get(i);

			if (this.professorId == comp.professorId && this.professorName.equals(comp.professorName))
				return true;
		}
		return false;
	}

	public void assignStudents(Student s) {
		this.stud = s;
		studList.add(s);
		
		for (Student student : studList) {
			System.out.println("the list of assinged students are : ");
			student.displayData();
		}
	}
}
