package com.news.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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

