package org.example.spring;

import org.example.spring.bean.Jerry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyInstantiationMain {
		public static void main(String[] args) {
				AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ProjectConfig.class);
				System.out.println("Lazy Instantiation started");
				System.out.println("While creating context Jerry bean not loaded since it is not referred till now. but below it is going to referred so it will get loaded now.");
				Jerry jerry = context.getBean(Jerry.class);
				jerry.call();;

		}
}
