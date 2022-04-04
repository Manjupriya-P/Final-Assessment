package com.onebill.Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	int mark;
	String Course;
	
	ArrayList<Student> Listobj = new ArrayList<Student>();

	public Student(int id, String name, int mark, String course) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.Course = course;

	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", Course=" + Course + "]";
	}

}
