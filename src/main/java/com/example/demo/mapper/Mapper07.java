package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {
	
	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'" />
			
			SELECT
				customerId,
				customerName,
				contactName,
				address
			FROM Customers
			WHERE CustomerName LIKE #{pattern}
			ORDER BY customerId DESC
			</script>
			""")
	List<Customer> sql1(String keyword);

	@Select("""
			<script>
			<bind name="pattern" value="'%' + search + '%'"/>
			
			SELECT
				employeeId id,
				firstName,
				lastName
			FROM Employees
			WHERE LastName LIKE #{pattern} OR FirstName LIKE #{pattern}
			</script>
			""")
	List<Employee> sql2(String search);

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			<if test = "false">
			WHERE CustomerID = 10
			</if>
			</script>
			""")
	Integer sql3();

	@Select("""
			<script>
			
			SELECT COUNT(*)
			FROM Customers
			<if test = "keyword != null">
				<bind name="pattern" value="'%' + keyword + '%'"/>
				WHERE CustomerName LIKE #{pattern}
			</if>
			</script>
			""")
	Integer sql4(String keyword);

	@Select("""
			<script>
			
			SELECT AVG(Price)
			FROM Products
			<if test = "i != 0">
				WHERE CategoryID = #{i}
			</if>
			</script>
			""")
	Double sql5(int i);

}
