package com.firstspring.first_web_development;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Pointcut("execution(* com.firstspring.first_web_development..*.bookFlight())")
	private void logPointCut() {
		
	}
	
	@AfterReturning(pointcut = "logPointCut()",returning = "retVal")
	public void logBookStatus(boolean retVal) {
		if (retVal) {
			System.out.println("book flight succeeded!");
		}else {
			System.out.println("book flight failed!");
		}
	}
}
