package com.nik.myApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nik.myApp.model.Student;
import com.nik.myApp.service.StudentService;

@RestController
@CrossOrigin(value="*")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/addStudent",method = RequestMethod.POST)
	public String addStudent( @RequestBody Student student) {
	return studentService.addStudent(student);
	
	}
	@RequestMapping(value="/getStudent/{id}",method = RequestMethod.GET)
	public Student disStudent( @PathVariable("id") int id) {
		return studentService.getSingleStudent(id);
	
	}
	@RequestMapping(value="/getStudent",method = RequestMethod.GET )//produces = "application/xml"
	public List<Student> getStudent() {
		return studentService.getStudent();
	
	}

}
