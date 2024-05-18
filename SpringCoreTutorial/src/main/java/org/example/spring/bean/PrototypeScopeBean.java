package org.example.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeScopeBean {
		public PrototypeScopeBean() {
				System.out.println("Constructing prototype scope object");
		}
}
