package com.example.thymeleaf.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_detail")
@Getter
@Setter
public class EmployeeModel {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	
		@Column(name = "empcode")
	    private String empcode;
		
		@Column(name = "empname")
	    private String empname;
		
		@Column(name = "age")
	    private String age;

	}
