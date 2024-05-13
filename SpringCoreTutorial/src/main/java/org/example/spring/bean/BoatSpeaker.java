package org.example.spring.bean;

import org.springframework.stereotype.Component;

@Component("BoatSpeaker")
public class BoatSpeaker implements Speaker{
		@Override public void makeSound() {
				System.out.println("Playing sound by Boat Speaker");
		}
}
