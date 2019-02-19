package com.web.soilanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plants", catalog = "soil_analyzer_db")
public class Plant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String plant;
	private double min;
	private double max;

	public int getPid() {
		return pid;
	}

	public Plant setPid(int pid) {
		this.pid = pid;
		return this;
	}

	public String getPlant() {
		return plant;
	}

	public Plant setPlant(String plant) {
		this.plant = plant;
		return this;
	}

	public double getMin() {
		return min;
	}

	public Plant setMin(double min) {
		this.min = min;
		return this;
	}

	public double getMax() {
		return max;
	}

	public Plant setMax(double max) {
		this.max = max;
		return this;
	}

}
