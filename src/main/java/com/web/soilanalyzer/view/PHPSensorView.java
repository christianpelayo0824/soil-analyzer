package com.web.soilanalyzer.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.soilanalyzer.model.PHPSensor;
import com.web.soilanalyzer.repository.PHPSensorRepository;

@RestController
@RequestMapping(value = "/api/sensor")
@CrossOrigin
public class PHPSensorView {

	@Autowired
	private PHPSensorRepository phpSensorRepo;

	@PostMapping(value = "/savePHPSensorData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean savePHPSensorData(@RequestBody PHPSensor phpSensor) {
		phpSensorRepo.save(phpSensor);
		return true;
	}

	@GetMapping(value = "/getAllPHPSensorData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PHPSensor> getAllPHPSensorData() {
		return phpSensorRepo.findAll();
	}

	@GetMapping(value = "/getLatestData", produces = MediaType.APPLICATION_JSON_VALUE)
	public PHPSensor getLatestData() {
		return phpSensorRepo.getLatestData();
	}
}
