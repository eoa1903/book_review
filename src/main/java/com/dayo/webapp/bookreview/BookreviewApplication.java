package com.dayo.webapp.bookreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ConfigurationPropertiesScan("com.dayo.webapp.bookreview.*")
@RestController("/book")

public class BookreviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookreviewApplication.class, args);
	}

	@GetMapping("/home")
	public String hello(){
		return "Hello Dayo!!";
	}


}
