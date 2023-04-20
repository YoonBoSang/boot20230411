package com.example.demo.domain;

import java.sql.*;

import lombok.*;

@Data
public class Employee {
	private int id;
	private String lastName;
	private String firstName;
	private Date birth;
	private String photo;
	private String notes;
}
