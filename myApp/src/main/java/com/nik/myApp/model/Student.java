package com.nik.myApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 100)
	private int studentId;
	private String standard;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", standard=" + standard + "]";
	}
	
	
	
}
