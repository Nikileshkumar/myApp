package com.nik.myApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.nik.myApp.dao.StudentDao;
import com.nik.myApp.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	public String addStudent(Student student) {
		System.out.println(student);
		boolean b=studentDao.existsById(student.getStudentId());
		if(b)
			return "Student already exists";
		studentDao.save(student);
		return "Registration Successful";
		
	}
	
	public List<Student> getStudent(){
		return studentDao.findAll();
	}

	public Student getSingleStudent(int id){
		return studentDao.getSingleStudent(id);
	}
}
