package com.web.soilanalyzer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.web.soilanalyzer.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Integer> {

	@Query(value = "SELECT * FROM plants WHERE :pHValue BETWEEN plants.min AND plants.max", 
			nativeQuery=true)
	List<Plant> getRecommendedPlant(@Param("pHValue") final double pHValue);
}
