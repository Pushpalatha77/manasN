package com.news.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertiserDTO {
	private Long id;
	private String name;
	private String contactInfo;
	private String company;
	private String email;
}
