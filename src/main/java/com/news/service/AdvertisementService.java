package com.news.service;

import com.news.dto.AdvertisementDTO;
import com.news.exception.AdvertisementNotFoundException;

import java.util.List;

public interface AdvertisementService {
    AdvertisementDTO add(AdvertisementDTO advertisementDTO);
    AdvertisementDTO update(Long id, AdvertisementDTO advertisementDTO) throws AdvertisementNotFoundException;
    void delete(Long id) throws AdvertisementNotFoundException;
    List<AdvertisementDTO> findAll();
}
