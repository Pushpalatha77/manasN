package com.news.service;

import com.news.dto.PaymentDTO;
import com.news.exception.PaymentNotFoundException;

import java.util.List;

public interface PaymentService {
    PaymentDTO add(PaymentDTO paymentDTO);
    PaymentDTO update(Long id, PaymentDTO paymentDTO) throws PaymentNotFoundException;
    void delete(Long id) throws PaymentNotFoundException;
    List<PaymentDTO> findAll();
}
