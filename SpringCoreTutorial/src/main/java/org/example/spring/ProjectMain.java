package org.example.spring;

import org.example.spring.service.IOCExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {
		public static void main(String[] args) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

				IOCExampleService service = new IOCExampleService();

				service.iOCUsingBeanAnnotation(context);

		}


}
