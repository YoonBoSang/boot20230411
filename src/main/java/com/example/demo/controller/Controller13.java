package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.jsp.jstl.sql.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) {
		String sql = """
				SELECT CustomerID, CustomerName, Address
				FROM Customers
				WHERE CustomerID
				""";

		// 1.
		// 2.
		List<Customer> obj = new ArrayList<>();
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {

				while (rs.next()) {
					int id = rs.getInt("customerId");
					String name = rs.getString("customerName");
//					System.out.println(id + ":" + name);

					Customer customer = new Customer();
					customer.setCustomerId(id);
					customer.setCustomerName(name);
					customer.setAddress(rs.getString("address"));
					obj.add(customer);
				}
				// 3. add attribute
				model.addAttribute("customerList", obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. forward
	}

	@RequestMapping("link2")
	public void method2(Model model) {
		String sql = """
				SELECT EmployeeId, LastName, FirstName
				FROM Employees
				""";

		List<Employee> list = new ArrayList<>();
		// Employee 클래스 작성
		// 프로퍼티 (id(int), lastName(String), FirstName(String))
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt("EmployeeId"));
					employee.setFirstName((rs.getString("FirstName")));
					employee.setLastName((rs.getString("LastName")));
					list.add(employee);
				}
			}
			model.addAttribute("employeeList", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link3")
	public String method3(@RequestParam String id, Model model) throws Exception {
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = """;

		sql += id;

		List<Customer> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		try (con; stmt; rs;) {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setAddress(rs.getString("address"));
				customer.setCustomerName(rs.getString("customerName"));

				list.add(customer);
			}
		}
		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}

	@RequestMapping("link4")
	public String method4(@RequestParam String id, Model model) throws Exception {
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = ? """;

		List<Customer> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();

		try (con; stmt; rs;) {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setAddress(rs.getString("address"));
				customer.setCustomerName(rs.getString("customerName"));
				list.add(customer);
			}
		}
		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}

	@RequestMapping("link5")
	public String method5(@RequestParam String id, Model model) throws Exception {

		String sql = """
				SELECT EmployeeId,
					   lastName,
					   firstName
				FROM Employees
				WHERE EmployeeId = ?
				""";
		List<Employee> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		try (con; pstmt; rs;) {
			Employee employee = new Employee();
			while (rs.next()) {
				employee.setId(rs.getInt("EmployeeId"));
				employee.setFirstName(rs.getString("firstName"));
				employee.setLastName(rs.getString("lastName"));
				
				
			}
			list.add(employee);
		}

		model.addAttribute("employeeList", list);

		return "/sub13/link2";
	}
}
