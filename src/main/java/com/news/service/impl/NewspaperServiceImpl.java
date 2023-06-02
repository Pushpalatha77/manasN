package com.news.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dto.NewspaperDTO;
import com.news.entity.Newspaper;
import com.news.exception.NewspaperNotFoundException;
import com.news.repository.NewspaperRepository;
import com.news.service.NewspaperService;
import com.news.util.MapperUtil;

@Service
public class NewspaperServiceImpl implements NewspaperService {

	@Autowired
	private NewspaperRepository newspaperRepository;
	

	@Override
	public NewspaperDTO add(NewspaperDTO newspaperDTO) {
		Newspaper newspaper = MapperUtil.mapDTOToNewspaper(newspaperDTO);
		Newspaper savedNewspaper = newspaperRepository.save(newspaper);
		return MapperUtil.mapNewspaperToDTO(savedNewspaper);
	}

	@Override
	public NewspaperDTO update(Long id, NewspaperDTO newspaperDTO) throws NewspaperNotFoundException {
		Newspaper newspaper = newspaperRepository.findById(id)
				.orElseThrow(() -> new NewspaperNotFoundException("Newspaper not found with ID: " + id));

		newspaper.setName(newspaperDTO.getName());
		newspaper.setDescription(newspaperDTO.getDescription());
		newspaper.setCirculation(newspaperDTO.getCirculation());
		newspaper.setPublicationFrequency(newspaperDTO.getPublicationFrequency());
		newspaper.setContactInfo(newspaperDTO.getContactInfo());

		Newspaper updatedNewspaper = newspaperRepository.save(newspaper);
		return MapperUtil.mapNewspaperToDTO(updatedNewspaper);
	}

	@Override
	public void delete(Long id) throws NewspaperNotFoundException {
		Newspaper newspaper = newspaperRepository.findById(id)
				.orElseThrow(() -> new NewspaperNotFoundException("Newspaper not found with ID: " + id));
		newspaperRepository.delete(newspaper);
	}

	@Override
	public List<NewspaperDTO> findAll() {
		List<Newspaper> newspapers = newspaperRepository.findAll();
		return newspapers.stream().map(newspaper -> MapperUtil.mapNewspaperToDTO(newspaper))
				.collect(Collectors.toList());
	}

}
