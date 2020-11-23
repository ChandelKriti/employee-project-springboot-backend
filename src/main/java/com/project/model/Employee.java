package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_salary")
	private double empSalary;
	
	@Column(name = "emp_designation")
	private String empDesignation;
	
	public Employee() {
		
	}

	public Employee(String empName, double empSalary, String empDesignation) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	
	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation=" + empDesignation + "]";
	}

	
	
	
}
