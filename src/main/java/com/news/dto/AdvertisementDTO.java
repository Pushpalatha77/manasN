package com.news.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementDTO {
	private Long id;
	private String title;
	private String description;
	private String image;
	private LocalDate publicationDate;
	private LocalDate expiryDate;
	private double price;
	private String status;
	private Long newspaperId;
	private Long advertiserId;
}
