package org.example.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
		@Qualifier("SonySpeaker")
		@Autowired
		private Speaker speaker;

		private Tyre tyre;

		public Speaker getSpeaker() {
				return speaker;
		}

		public void setSpeaker(Speaker speaker) {
				this.speaker = speaker;
		}

		public Tyre getTyre() {
				return tyre;
		}

		/**
		 * Setter method way to autowire object
		 * @param tyre
		 */
		@Autowired
		public void setTyre(Tyre tyre) {
				this.tyre = tyre;
		}
}
