package org.beebiome.dataportal;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataPortalApiApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DataPortalApiApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}