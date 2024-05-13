package org.example.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CEATTyre implements Tyre{
		@Override public void moveCar() {
				System.out.println("Moving car using CEAT tyre");
		}
}
