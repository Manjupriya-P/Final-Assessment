package com.onebill.Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Methods {
	static int id = 0;
	static String name = null;
	static int mark = 0;
	static String course = null;
	static boolean exit = true;

	public Methods(int id2, String name2, int mark2, String course2) {

	}

	static boolean exit(int a) {
		if (a == 0)
			return false;
		else
			return true;

	}

	public static void main(String[] args) {

		Student obj = new Student(id, name, mark, course);
		Student student = new Student(1, "manju", 80, "ECE");
		Student student1 = new Student(02, "priya", 87, "EEE");
		Student student4 = new Student(4, "jeno", 90, "ECE");
		Student student5 = new Student(5,"jensha",79,"EEE");
		

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student4);
		list.add(student5);
		while (exit) {
			System.out.println(
					"1.Add Student\n 2.get student by id\n 3.sorting methods\n 4.deleting\n 5.edit student\n 6.print the list of students\n 7.exit\n");

			System.out.println("\nenter your choice:\n");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();

			switch (c) {
			case 1: {
				boolean a=true;
				while (a) {
					System.out.println("enter the id of the student: ");
					int id = sc.nextInt();
					System.out.println("Enter the name of the Student: ");
					String name = sc.next();
					System.out.println("Enter the mark of the Student: ");
					int mark = sc.nextInt();
					System.out.println("Enter the course of the Student: ");
					String course = sc.next();
					Student student3 = new Student(id, name, mark, course);
					list.add(student3);
					for (Student std : list) {
						System.out.println(std);
					}
					System.out.println("do you want to add another student?");
					a = sc.nextBoolean();
					
				}
				break;
			}

			case 2:
				System.out.println("enter the id of the student :");
				int id1 = sc.nextInt();
				for (Student stdd : list) {
					if (stdd.id == id1) {
						System.out.println(stdd);
					}
				}
				break;
			case 3:
				System.out.println("enter the type of sorting: ");
				String ip = sc.next();
				SortById sortById = new SortById();
				SortByName sortByName = new SortByName();
				SortByMarks sortByMarks = new SortByMarks();
				switch (ip) {
				case "id": {
					Collections.sort(list, sortById);
					for (Student std : list) {
						System.out.println(std);
					}

					break;
				}
				case "name": {
					Collections.sort(list, sortByName);
					for (Student std : list) {
						System.out.println(std);
					}
					break;
				}
				case "marks": {
					Collections.sort(list, sortByMarks);
					for (Student std : list) {
						System.out.println(std);
					}
					break;
				}
				}
				break;
			case 4:
				System.out.println("enter the id to be deleted: ");
				int r = sc.nextInt();
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).id == r)
						list.remove(j);

				}
				for (Student std : list) {
					System.out.println(std);
				}
				break;
			case 5:
				System.out.println("mention the id to be edited: ");
				int id2 = sc.nextInt();
				System.out.println("mention the type of editing: ");
				String type = sc.next();
				switch (type) {
				case "name": {
					System.out.println("enter the name to be edited:");
					String newName = sc.next();
					for (int k = 0; k < list.size(); k++) {
						if (list.get(k).id == id2) {
							Student student7 = new Student(id2, newName, list.get(k).mark, list.get(k).Course);
							list.set(k, student7);

						}
					}
				}
					for (Student std : list) {
						System.out.println(std + "\n");
					}
					break;
				case "mark": {
					System.out.println("enter the mark to be edited:\n");
					int newMark = sc.nextInt();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).id == id2) {
							Student student8 = new Student(id2, list.get(i).name, newMark, list.get(i).Course);
							list.set(i, student8);
						}
					}
					for (Student std : list) {
						System.out.println(std + "\n");
					}
				}
					break;
				case "course": {
					System.out.println("enter the course to be edited:\n");
					String newCourse = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).id == id2) {
							Student student9 = new Student(id2, list.get(i).name, list.get(i).mark, newCourse);
							list.set(i, student9);

						}
					}
				}
					for (Student std : list) {
						System.out.println(std);
					}
					break;
				}
				break;
			case 6:
				System.out.println("the list of students are: \n");
				for (Student std : list) {
					System.out.println(std);
				}

				break;
			case 7:
				exit = exit(0);

				break;
			}
		}
	}
}