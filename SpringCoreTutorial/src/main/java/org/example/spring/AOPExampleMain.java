package org.example.spring;

import org.example.spring.aop.AdditionService;
import org.example.spring.aop.MultiplicationService;
import org.example.spring.aop.SubtractionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPExampleMain {
		public static void main(String[] args) {
				/**
				 * 2 ways to use aspect is execution and annotation. See LogAspect for these 2 types
				 */
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

				AdditionService add = context.getBean(AdditionService.class);
				add.returnAddition(1,4);

				SubtractionService sub = context.getBean(SubtractionService.class);;
				sub.returnAddition(4,1);

				MultiplicationService mul = context.getBean(MultiplicationService.class);
				mul.returnMultiplication(3, 4);
		}
}
