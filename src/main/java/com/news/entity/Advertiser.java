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
@Table(name = "advertiser")
public class Advertiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String name;
    
    private String contactInfo;
    
    private String company;
    
    private String email;
    
    @OneToMany(mappedBy = "advertiser")
    private List<Advertisement> advertisements;
}
