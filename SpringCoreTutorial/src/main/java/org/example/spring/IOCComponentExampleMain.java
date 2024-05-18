package org.example.spring;

import org.example.spring.bean.Person;
import org.example.spring.service.PersonVehicleExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCComponentExampleMain {
		public static void main(String[] args) {
				var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

				PersonVehicleExampleService service = new PersonVehicleExampleService();
				service.iOCUsingComponentAnnotation(applicationContext);

		}
}
