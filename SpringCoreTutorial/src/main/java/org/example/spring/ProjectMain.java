package org.example.spring;

import org.example.spring.DTO.Vehicle;
import org.example.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {
		public static void main(String[] args) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

				Vehicle v = context.getBean(Vehicle.class);

				System.out.println("Printing vehicle : "+ v);

				Vehicle v1 = context.getBean(Vehicle.class);

				System.out.println("Printing vehicle : "+ v1);
		}
}
