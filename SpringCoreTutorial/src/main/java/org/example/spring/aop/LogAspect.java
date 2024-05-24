package org.example.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
//@Aspect is aspect
@Aspect
public class LogAspect {

		private Logger LOG = Logger.getLogger(LogAspect.class.getName());

		//@Before is advice.  JointPoint is join point. Inside advice is pointcut expression.
		@Before("execution(public * org.example.spring.aop.*.returnAddition(..))")
		public void doPublicLogging(JoinPoint joinPoint){
			LOG.info("Loggin log for public method : "+joinPoint.getSignature().toString());
		}

		//Custom Annotation example. Only those method will get affected which has following CustomLogAspect annotation.
		@Before("@annotation(org.example.spring.aop.CustomLogAspect)")
		public void doPublicLoggingOnlyForAnnotedMethod(JoinPoint joinPoint){
				LOG.info("Loggin log for doPublicLoggingOnlyForAnnotedMethod method : "+joinPoint.getSignature().toString());
		}

}
