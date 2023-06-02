package com.news.entity;
import java.time.LocalDate;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_request")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "advertisement_id")
    private Advertisement advertisement;
    
    @ManyToOne
    @JoinColumn(name = "advertiser_id")
    private Advertiser advertiser;
    
    
    private LocalDate bookingDate;
    
    private String status;
}

