package com.news.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewspaperDTO {
    private Long id;
    private String name;
    private String description;
    private int circulation;
    private String publicationFrequency;
    private String contactInfo;
}

