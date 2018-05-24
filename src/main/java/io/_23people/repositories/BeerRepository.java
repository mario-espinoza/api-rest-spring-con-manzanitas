package io._23people.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io._23people.model.Beer;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Integer> {
	Page<Beer> findByNameContainingIgnoreCase(String name, Pageable pageable);

	Page<Beer> findAll(Pageable pageable);
}
