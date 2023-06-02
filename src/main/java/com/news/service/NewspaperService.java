package com.news.service;

import java.util.List;

import com.news.dto.NewspaperDTO;
import com.news.exception.NewspaperNotFoundException;

public interface NewspaperService {

	NewspaperDTO add(NewspaperDTO paper);

	List<NewspaperDTO> findAll();

	NewspaperDTO update(Long id, NewspaperDTO newspaperDTO) throws NewspaperNotFoundException;

	void delete(Long id) throws NewspaperNotFoundException;
}
