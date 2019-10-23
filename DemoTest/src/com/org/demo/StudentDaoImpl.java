package com.org.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao  {

	@Override
	public void addStudent(Student st) {
		
		
	}

	@Override
	public List<Student> getStudent() {
		
		return null;
	}

	@Override
	public int deleteStudent(int id) {
		
		return 0;
	}

}
