package org.example.spring.service;

import org.example.spring.bean.Student;
import org.springframework.context.ApplicationContext;

public class StudentBeanService {

		public void iOCUsingBeanAnnotation(ApplicationContext context){
				System.out.println("Example of @Bean annotation:- ");
				Student v = context.getBean("wilson", Student.class);

				System.out.println("Printing Student : "+ v);

				Student v1 = context.getBean("florida", Student.class);

				System.out.println("Printing Student : "+ v1);

				Student v2 = context.getBean(Student.class);

				System.out.println("Printing Student : "+ v2);
		}
}
