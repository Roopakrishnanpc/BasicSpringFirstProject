package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Rlearning.demo.bean.Demo1Sample;

@SpringBootApplication
@ComponentScan(basePackages = "com.Rlearning.demo.bean")
public class SprngDemoStarterProject1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SprngDemoStarterProject1Application.class, args);
		Demo1Sample obj=context.getBean(Demo1Sample.class);
		obj.code();
	}

}
