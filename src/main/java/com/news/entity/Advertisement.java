package com.news.entity;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String title;
    
    private String description;
    
    private String image;
    
    
    private LocalDate publicationDate;
    
    
    private LocalDate expiryDate;
    
    private double price;
    
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "newspaper_id")
    private Newspaper newspaper;
    
    @ManyToOne
    @JoinColumn(name = "advertiser_id")
    private Advertiser advertiser;
    
    @OneToOne(mappedBy = "advertisement")
    private Payment payment;
}

