package org.example.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
		private String name = "Alex";

		/**
		 * Class level autowiring the object
		 */
		@Autowired
		private Vehicle vehicle;

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public Vehicle getVehicle() {
				return vehicle;
		}

		public void setVehicle(Vehicle vehicle) {
				this.vehicle = vehicle;
		}
}
