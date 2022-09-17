package com.ProjectManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManagementApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("your project has been created successfully");
		ArrayList<Student> student = new ArrayList<>();
		ArrayList<Professor> professor = new ArrayList<>();
		ArrayList<Project> project = new ArrayList<>();

		// for adding projects
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter project Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter project Title");
			String projTitle = sc.nextLine();
			Project p = new Project();
			p.setData(id, projTitle);
			project.add(p);
			System.out.println("Project Details have been added Successfully!!!");
			System.out.println("-----------------X------------------");
		}

		// System.out.println(project.size());
		// System.out.println(project);

		// displaying the project details
		for (int i = 0; i < project.size(); i++) {
			project.get(i).displayData();
			System.out.println("-------------X--------------");
		}

		// adding the students
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Student Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String studentName = sc.nextLine();
			Student s = new Student();
			s.setData(id, studentName);
			student.add(s);
			System.out.println("Student Details have been added Successfully!!!");
			System.out.println("-----------------X------------------");
			System.out.println("-----------------X------------------");
		}
		// displaying the student list
		for (int i = 0; i < student.size(); i++) {
			student.get(i).displayData();
			System.out.println("-------------X--------------");
			System.out.println("-------------X--------------");
		}
		
		
		//adding the professor list
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Professor Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Professor Name");
			String profName = sc.nextLine();
			Professor prof = new Professor();
			prof.setData(id, profName);
			professor.add(prof);
			System.out.println("Professor Details have been added Successfully!!!");
			System.out.println("-----------------X------------------");
			System.out.println("-----------------X------------------");
		}
		

		//displaying the list of professors
		for (int i = 0; i < professor.size(); i++) {
			professor.get(i).displayData();
			System.out.println("-----------------X------------------");
			System.out.println("-----------------X------------------");
		}
		
	}
}