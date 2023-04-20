package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;


@Mapper
public interface Mapper01 {

	@Select("""
			SELECT CustomerName 
			FROM Customers
			WHERE CustomerID = 1
			""")
	String method1();
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EmployeeID = 1
			""")
	String method2();
	
	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierID = 1
			""")
	String method3();
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerId = #{id}
			""")
	String method4(Integer id);
	
	@Select("""
			SELECT LastName
			FROM Employees
			WHERE EmployeeID = #{id}
			""")
	String method5(Integer id);
	
	@Select("""
			SELECT Price
			FROM MyTable33
			LIMIT 1
			""")
	Integer method6();
	
	@Select("""
			SELECT Published
			FROM MyTable33
			LIMIT 1
			""")
	LocalDate method7();
	
	@Select("""
			SELECT Updated
			FROM MyTable33
			LIMIT 1
			""")
	LocalDateTime method8();
	
	@Select("""
			SELECT Weight
			FROM MyTable33
			LIMIT 1
			""")
	Double method9();
	
	@Select("""
			SELECT *
			FROM MyTable33
			LIMIT 1
			""")
	Dto06 method10();
	
	@Select("""
			SELECT *
			FROM MyTable32
			LIMIT 1
			""")
	Dto05 method11();
	
	@Select("""
			SELECT *
			FROM Customers
			WHERE CustomerID = 5
			""")
	Customer method12();
	
	@Select("""
			SELECT 
				SupplierID ID,
				SupplierName Name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country,
				Phone
			FROM Suppliers
			WHERE SupplierID = 5
			""")
	Supplier method13();
	
	@Select("""
			SELECT 
				EmployeeID ID,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeID = 5
			""")
	Employee method14();
	
}	
