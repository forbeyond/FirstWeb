package com.firstspring.first_web_development;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

@EnableAspectJAutoProxy
@ComponentScan
public class SpringTest {

	public static void main(String[] args) {
		boosGoSomeWhere();
	}

	static void boosGoSomeWhere() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
		try{
		Boos boos = context.getBean(Boos.class);
		boos.goSomeWhere();
		}finally {
			context.close();
		}
	}
}
