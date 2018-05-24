package io._23people.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io._23people.model.Beer;
import io._23people.services.BeerService;

@Controller
@RequestMapping("/api/beers")
public class BeerController {
	private static Logger logger = LoggerFactory.getLogger(BeerController.class);

	@Autowired
	private BeerService service;

	public BeerController() {

	}

	@GetMapping
	public @ResponseBody Page<Beer> home(Pageable pageable, String filter) {

		logger.info("Controller Find Page");

		return this.service.findPaginated(filter, pageable);

	}

	// Return all courses, for use in select lists
	@GetMapping("/all")
	public @ResponseBody List<Beer> all() {

		return this.service.findAll();
	}

	@GetMapping("/{id}")
	public @ResponseBody Beer findById(@PathVariable(value = "id") Integer id) {

		return this.service.findOne(id);

	}

	@PostMapping
	public @ResponseBody Beer create(@Valid @RequestBody Beer model) {

		return this.service.create(model);

	}

	@PutMapping("/{id}")
	public @ResponseBody Beer update(@PathVariable(value = "id") Integer id, @RequestBody Beer course) {

		return this.service.update(id, course);

	}

	@DeleteMapping("/{id}")
	public @ResponseBody String delete(@PathVariable(value = "id") Integer id) {

		return this.service.delete(id);

	}
}
