package com.example.restapidemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.restapidemo.model.Employee;
import com.example.restapidemo.repository.EmployeeRepository;

@SpringBootApplication
public class RestApiDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestApiDemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(RestApiDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Employee("Marcelo", "Hama", true));
			employeeRepository.save(new Employee("Poline", "Cascais", true));
			employeeRepository.save(new Employee("Noah ", "Hama", false));
			employeeRepository.save(new Employee("Lets", "Code", true));
			logger.info("The sample data has been generated");
		};
	}

}
