package com.nik.myApp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nik.myApp.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	@Query("from Student s where s.studentId=?1")
	public Student getSingleStudent(int id);

}
