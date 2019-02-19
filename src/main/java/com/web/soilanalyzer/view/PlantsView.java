package com.web.soilanalyzer.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.soilanalyzer.model.Plant;
import com.web.soilanalyzer.repository.PlantRepository;

@RestController
@RequestMapping(value = "/api/plants")
@CrossOrigin
public class PlantsView {

	@Autowired
	private PlantRepository plantRepo;

	@PostMapping(value = "/savePlants", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean savePlants(@RequestBody final Plant plant) {
		plantRepo.save(plant);
		return true;
	}

	@GetMapping(value = "/getAllPlants", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Plant> getAllPlants() {
		return plantRepo.findAll();
	}

	@GetMapping(value = "/getRecommendedPlant/{pHValue}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Plant> getRecommendedPlant(@PathVariable("pHValue") final double pHValue) {
		return plantRepo.getRecommendedPlant(pHValue);
	}

}
