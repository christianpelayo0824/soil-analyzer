package com.web.soilanalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.soilanalyzer.model.PHPSensor;

@Repository
public interface PHPSensorRepository extends JpaRepository<PHPSensor, Integer> {
	
	@Query(value="SELECT * FROM php_sensor ORDER BY php_sensor.sid DESC LIMIT 1"
			, nativeQuery= true)
	PHPSensor getLatestData();
}
