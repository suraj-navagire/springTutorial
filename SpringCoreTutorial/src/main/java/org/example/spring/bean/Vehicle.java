package org.example.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
		private String name;

		@Autowired
		private VehicleService service;

		/**
		 * Constructor way to autowire object
		 */
		@Autowired
		public Vehicle(VehicleService service) {
				this.service = service;
				this.name = "Tata nexon";
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public VehicleService getService() {
				return service;
		}

		public void setService(VehicleService service) {
				this.service = service;
		}
}
