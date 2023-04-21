package com.example.demo.domain;

import lombok.*;

@Data
public class Customer {
	private String customerName;
	private int customerId;
	private String address;
	private String contactName;
	private String city;
	private String postalCode;
	private String country;
	
}
