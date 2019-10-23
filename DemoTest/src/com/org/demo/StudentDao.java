package com.org.demo;

import java.util.List;

public interface StudentDao {
	
	public void addStudent(Student st);
	
	public List<Student> getStudent();
	
	
	public int deleteStudent(int  id);

}
