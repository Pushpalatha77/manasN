package com.news.service;

import com.news.dto.AdvertiserDTO;
import com.news.exception.AdvertiserNotFoundException;

import java.util.List;

public interface AdvertiserService {
    AdvertiserDTO add(AdvertiserDTO advertiserDTO);
    AdvertiserDTO update(Long id, AdvertiserDTO advertiserDTO) throws AdvertiserNotFoundException;
    void delete(Long id) throws AdvertiserNotFoundException;
    List<AdvertiserDTO> findAll();
}
