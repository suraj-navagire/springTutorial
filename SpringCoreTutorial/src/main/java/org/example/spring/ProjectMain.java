package org.example.spring;

import org.example.spring.service.StudentBeanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {
		public static void main(String[] args) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

				StudentBeanService service = new StudentBeanService();

				service.iOCUsingBeanAnnotation(context);

		}


}
