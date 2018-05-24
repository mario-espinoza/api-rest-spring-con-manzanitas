package io._23people.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io._23people.model.Beer;
import io._23people.repositories.BeerRepository;

public class BeerServiceImpl implements BeerService {

	@Autowired
	private BeerRepository repository;

	public BeerServiceImpl() {

	}

	@Override
	public List<Beer> findAll() {
		return (List<Beer>) this.repository.findAll();
	}

	@Override
	public Page<Beer> findPaginated(String filter, Pageable pageable) {
		return this.repository.findAll(pageable);
	}

	@Override
	public Beer findOne(Integer id) {
		return this.repository.findOne(id);
	}

	@Override
	public Beer create(Beer course) {
		return this.repository.save(course);
	}

	@Override
	public Beer update(Integer id, Beer course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
