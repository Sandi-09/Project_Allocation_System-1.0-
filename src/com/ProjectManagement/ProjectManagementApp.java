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
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter project Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter project Title : ");
			String projTitle = sc.nextLine();
			if (project.size() == 0) {
				Project p = new Project();
				p.setData(id, projTitle);
				project.add(p);
				p.displayData();
			} else if (project.size() > 0) {
				Project p = new Project();
				p.setData(id, projTitle);
				if (p.equals(project) == false) {
					project.add(p);
					p.displayData();
				} else {
					System.out.println("Same projects cant be added again");
					break;
				}
				System.out.println("Project Details have been added Successfully!!!");
				System.out.println("-----------------X------------------");
				System.out.println("-----------------X------------------");
			}
		}

		// displaying the project details
		for (int i = 0; i < project.size(); i++) {
			project.get(i).displayData();
			System.out.println("-------------X--------------");
			System.out.println("-------------X--------------");
		}

		// adding the students
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Student Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name : ");
			String studentName = sc.nextLine();
			if (student.size() == 0) {
				Student s = new Student();
				s.setData(id, studentName);
				student.add(s);

				s.displayData();
			} else if (student.size() > 0) {
				Student s = new Student();
				s.setData(id, studentName);
				if (s.equals(student) == false) {
					student.add(s);
					s.displayData();
				} else {
					System.out.println("Same students cant be added again");
					break;
				}
				System.out.println("Student Details have been added Successfully!!!");
				System.out.println("-----------------X------------------");
				System.out.println("-----------------X------------------");
			}
		}
		// displaying the student list
		for (int i = 0; i < student.size(); i++) {
			student.get(i).displayData();
			System.out.println("-------------X--------------");
			System.out.println("-------------X--------------");
		}

		// adding the professor list
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Professor Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Professor Name : ");
			String profName = sc.nextLine();
			if (professor.size() == 0) {
				Professor p = new Professor();
				p.setData(id, profName);
				professor.add(p);
				p.displayData();
			} else if (professor.size() > 0) {
				Professor p = new Professor();
				p.setData(id, profName);
				if (p.equals(professor) == false) {
					professor.add(p);
					p.displayData();
				} else {
					System.out.println("Same projects cant be added again");
					break;
				}
				System.out.println("Professor Details have been added Successfully!!!");
				System.out.println("-----------------X------------------");
				System.out.println("-----------------X------------------");
			}
		}

		// displaying the list of professors
		for (int i = 0; i < professor.size(); i++) {
			professor.get(i).displayData();
			System.out.println("-----------------X------------------");
			System.out.println("-----------------X------------------");
		}

		Assingment.assignProj(professor.get(0), student.get(0), project.get(0));
		Assingment.assignProj(professor.get(0), student.get(1), project.get(0));
		Assingment.assignProj(professor.get(1), student.get(1), project.get(1));
		Assingment.assignProj(professor.get(2), student.get(2), project.get(3));
		Assingment.assignProj(professor.get(3), student.get(4), project.get(6));
		Assingment.assignProj(professor.get(2), student.get(3), project.get(2));
		sc.close();
	}
}