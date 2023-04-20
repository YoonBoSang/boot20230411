package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Dto05 {
	private int age;
	private String name;
	private double Price;
	private LocalDate birth;
	private LocalDateTime inserted;
}
