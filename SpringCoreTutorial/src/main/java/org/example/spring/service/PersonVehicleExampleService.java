package org.example.spring.service;

import org.example.spring.ProjectConfig;
import org.example.spring.bean.Person;
import org.example.spring.bean.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonVehicleExampleService {
		public void iOCUsingComponentAnnotation(AnnotationConfigApplicationContext applicationContext) {
				Person person = applicationContext.getBean(Person.class);
				String name = person.getName();
				Vehicle vehicle = person.getVehicle();
				System.out.println(name +" owns "+vehicle.getName());
				vehicle.getService().getSpeaker().makeSound();
				vehicle.getService().getTyre().moveCar();
		}
}
