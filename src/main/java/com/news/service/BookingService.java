package com.news.service;

import com.news.dto.BookingDTO;
import com.news.exception.BookingNotFoundException;

import java.util.List;

public interface BookingService {
    BookingDTO add(BookingDTO bookingDTO);
    BookingDTO update(Long id, BookingDTO bookingDTO) throws BookingNotFoundException;
    void delete(Long id) throws BookingNotFoundException;
    List<BookingDTO> findAll();
}

