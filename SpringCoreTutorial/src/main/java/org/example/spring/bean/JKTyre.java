package org.example.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class JKTyre implements Tyre{
		@Override public void moveCar() {
				System.out.print("Moving car using JK tyre");
		}
}
