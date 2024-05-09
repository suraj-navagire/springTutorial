package org.example.spring.config;

import org.example.spring.DTO.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

		@Bean
		public Vehicle vehicle(){
				System.out.println("Inside Bean method of audi vehicle of id 1");
				Vehicle v = new Vehicle();
				v.setId("1");
				v.setName("Audi");
				v.setDescription("Audi vehicle");
				return v;
		}

}
