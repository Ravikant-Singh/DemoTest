package com.org.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao stdao;

	@Override
	public void addStudent(Student st) {
		System.out.println("addStudent ::"+st.toString());
		stdao.addStudent(st);
		
		
	}

	@Override
	public List<Student> getStudent() {
		
		return stdao.getStudent();
	}

	@Override
	public int deleteStudent(int id) {
		
		return stdao.deleteStudent(id);
	}

}
