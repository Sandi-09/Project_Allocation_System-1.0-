package com.ProjectManagement;

public class Assingment {
	public static boolean assignProj(Professor prof, Student stud, Project proj) {
		System.out.println("-----------------------------#####--------------------------------");
		System.out.println("Project Allotment System Terminal View Starts Here: ");
		System.out.println();
		prof.displayData();
		// System.out.println();
		stud.displayData();
		// System.out.println();
		proj.displayData();
		// System.out.println();

		prof.assignStudents(stud);
		// if-else check
		if (stud.isAssigned == false)
			stud.assignProject(proj);
		else
			System.out.println("This student is already assigned to a project");

		stud.assignProfessor(prof);

		System.out.println("-----------------------------#####--------------------------------");
		return false;

	}

}
