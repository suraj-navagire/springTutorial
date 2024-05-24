package org.example.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class AdditionService {
		public String returnAddition(int a, int b) {
				return calculate(a, b);
		}

		private String calculate(int a, int b){
				return String.valueOf(a + b);
		}
}
