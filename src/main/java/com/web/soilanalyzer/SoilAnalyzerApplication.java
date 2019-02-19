package com.web.soilanalyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.web.soilanalyzer.model.Plant;
import com.web.soilanalyzer.repository.PlantRepository;

@SpringBootApplication(scanBasePackages = { "com.web.soilanalyzer" })
@EnableJpaRepositories(basePackages = { "com.web.soilanalyzer.repository" })
@EntityScan(basePackages = { "com.web.soilanalyzer.model" })
public class SoilAnalyzerApplication implements CommandLineRunner {

	@Autowired
	private PlantRepository plantRepo;

	public static void main(String[] args) {
		SpringApplication.run(SoilAnalyzerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		plantRepo.save(new Plant().setPlant("Tangkong").setMin(1.23).setMax(34.2));
		plantRepo.save(new Plant().setPlant("Kamunggay").setMin(2.23).setMax(6.2));
	}

}
