package com.web.soilanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "php_sensor", catalog = "soil_analyzer_db")
public class PHPSensor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private double phpSensor;
	private double voltage;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getPhpSensor() {
		return phpSensor;
	}

	public void setPhpSensor(double phpSensor) {
		this.phpSensor = phpSensor;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

}
