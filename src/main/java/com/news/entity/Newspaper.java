package com.news.entity;
import java.util.List;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "newspaper")
public class Newspaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String description;
    
    private int circulation;
    
    private String publicationFrequency;
    
    private String contactInfo;
    
    @OneToMany(mappedBy = "newspaper")
    private List<Advertisement> advertisements;
}
