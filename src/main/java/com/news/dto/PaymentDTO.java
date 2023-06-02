package com.news.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
	private Long id;
	private Long advertisementId;
	private double amount;
	private LocalDate paymentDate;
}
