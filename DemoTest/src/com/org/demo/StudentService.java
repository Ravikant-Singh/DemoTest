package com.org.demo;

import java.util.List;

public interface StudentService {
	
    public void addStudent(Student st);
     
	
	public List<Student> getStudent();
	
	
	public int deleteStudent(int  id);

}
