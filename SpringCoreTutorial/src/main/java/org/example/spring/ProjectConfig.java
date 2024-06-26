package org.example.spring;

import org.example.spring.bean.DummyType;
import org.example.spring.bean.Student;
import org.springframework.context.annotation.*;

@ComponentScan(value = {"org.example.spring.bean", "org.example.spring.aop"})
@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

		@Bean
		public DummyType dummy(){
				System.out.println("Inside dummyType bean creation method");
				DummyType d = new DummyType("Dummy Type object");
				return d;
		}


		@Bean
		public Student wilson(){
				System.out.println("Inside wilson bean creation method");
				Student v = new Student("1","wilson");
				return v;
		}

		@Bean("flori")
		public Student florida(){
				System.out.println("Inside florida bean creation method");
				Student v = new Student("2", "florida");
				return v;
		}

		@Primary
		@Bean
		public Student jack(){
				System.out.println("Inside jack bean creation method");
				Student v = new Student("3", "jack");
				return v;
		}

}
