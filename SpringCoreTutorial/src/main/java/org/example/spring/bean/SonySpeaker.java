package org.example.spring.bean;

import org.springframework.stereotype.Component;

@Component(value="SonySpeaker")
public class SonySpeaker implements Speaker{
		@Override public void makeSound() {
				System.out.println("Playing sound by Sony Speaker");
		}
}
