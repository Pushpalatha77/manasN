package com.news.dto;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long id;
    private Long advertisementId;
    private Long advertiserId;
    private LocalDate bookingDate;
    private String status;
}

