package org.example.spring;

import org.example.spring.bean.PrototypeScopeBean;
import org.example.spring.bean.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopExampleMain {
		public static void main(String[] args) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
				System.out.println("BeanScopExampleMain Started");

				context.getBean(SingletonBean.class);
				context.getBean(SingletonBean.class);
				context.getBean(PrototypeScopeBean.class);
				context.getBean(PrototypeScopeBean.class);
		}
}
