package org.example.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * No need to use @scope annotation for singleton bean cause default scope of any bean is singleton only.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {
		public SingletonBean() {
				System.out.println("Constructing Singleton bean object");
		}
}
