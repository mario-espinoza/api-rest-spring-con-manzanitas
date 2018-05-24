package io._23people;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io._23people.services.BeerService;
import io._23people.services.BeerServiceImpl;

@Configuration
public class Config {

	@Bean
	public BeerService beerService() {
		return new BeerServiceImpl();
	}
}
