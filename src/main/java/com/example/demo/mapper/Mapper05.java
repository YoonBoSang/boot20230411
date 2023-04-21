package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper05 {
	
	@Update("""
			UPDATE MyTable39
			SET 
				Col2 = '수정된 값',
				Col3 = 99999
			""")
	int sql1();
	
	@Update("""
			UPDATE MyTable39
			SET
				Col2 = #{val1},
				Col3 = #{val2}
			WHERE Col1 = #{key}
			""")
	int sql2(Integer key, String val1, Integer val2);
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{v1},
				Country = #{v2}
			WHERE CustomerID = #{id}
			""")
	int sql3(Integer id, String v1, String v2);
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{customerName},
				ContactName = #{contactName},
				Address = #{address},
				City = #{city},
				PostalCode = #{postalCode},
				Country = #{country}
			WHERE
				CustomerID = #{customerId}
			""")
	int sql4(Customer customer);
	
	@Select("""
			SELECT * FROM Customers
			WHERE CustomerID = #{id}
			""")
	Customer sql5(Integer id);
	
	@Select("""
			SELECT 
				EmployeeID id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeID = #{id}
			""")
	Employee sql6(Integer id);
	
	@Update("""
			UPDATE Employees
			SET 
				LastName = #{lastName},
				firstName = #{firstName},
				birthDate = #{birth},
				photo = #{photo},
				notes = #{notes}
			WHERE EmployeeID = #{id}
			""")
	int sql7(Employee employee);

}
