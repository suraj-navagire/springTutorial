package org.example.spring;

import org.example.spring.bean.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIExampleMain {
		public static void main(String[] args) {

				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

				System.out.println("DIExample started");

				Vehicle v = context.getBean(Vehicle.class);

				v.getService().getTyre().moveCar();
				v.getService().getSpeaker().makeSound();

		}
}
