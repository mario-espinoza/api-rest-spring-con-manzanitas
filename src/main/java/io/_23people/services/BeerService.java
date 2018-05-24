package io._23people.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io._23people.model.Beer;

public interface BeerService {
	List<Beer> findAll();

	Page<Beer> findPaginated(String filter, Pageable pageable);

	Beer findOne(Integer id);

	Beer create(Beer course);

	Beer update(Integer id, Beer course);

	String delete(Integer id);
}
