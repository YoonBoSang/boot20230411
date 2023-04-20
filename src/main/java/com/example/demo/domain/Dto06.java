package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Dto06 {
	private double weight;
	private String title;
	private int Price;
	private LocalDate published;
	private LocalDateTime updated;
}
