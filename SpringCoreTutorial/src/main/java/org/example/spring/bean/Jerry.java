package org.example.spring.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Jerry {
		public Jerry() {
				System.out.println("Constructing Jerry object");
		}

		public void call(){
				System.out.println("Calling Jerry");
		}
}
