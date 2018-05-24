package io._23people.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Beer implements Drink {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BEER_SEQ")
	@SequenceGenerator(sequenceName = "beer_seq", allocationSize = 1, name = "BEER_SEQ")
	private Integer id;

	private double alcoholContent;
	private String brand;
	private String color;
	private int ibu;
	private String name;

	@Override
	public double getAlcoholVolume() {
		return alcoholContent;
	}

	public void setAlcoholVolume(double value) {
		this.alcoholContent = value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String value) {
		this.brand = value;
	}

	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String value) {
		this.color = value;
	}

	public int getIbu() {
		return ibu;
	}

	public void setIbu(int value) {
		this.ibu = value;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(double alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
}
