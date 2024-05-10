package org.example.spring.service;

import org.example.spring.bean.DummyType;
import org.example.spring.bean.Student;
import org.springframework.context.ApplicationContext;

public class IOCExampleService {

		public void iOCUsingBeanAnnotation(ApplicationContext context){
				System.out.println("Example of @Bean annotation:- ");

				DummyType d = context.getBean(DummyType.class);
				System.out.println("Printing DummyType using data type only : "+ d);

				Student v = context.getBean("wilson", Student.class);

				System.out.println("Printing Student using bean name : "+ v);

				Student v1 = context.getBean("florida", Student.class);

				System.out.println("Printing Student using bean name: "+ v1);

				Student v2 = context.getBean(Student.class);

				System.out.println("Printing Student primary annotation: "+ v2);
		}
}
