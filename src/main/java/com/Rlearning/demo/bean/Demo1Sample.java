package com.Rlearning.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo1Sample {
	@Autowired
	Demochild demo;
public void code()
{
	demo.compile();
	System.out.println("In Demo1Sample");
}
}
