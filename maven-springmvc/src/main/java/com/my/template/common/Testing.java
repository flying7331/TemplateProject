package com.my.template.common;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Testing {

	@Resource TestingAnnotationService testingAnnotationService;
	public void test(){
		System.out.println("pring test");
		testingAnnotationService.testAnnotation();
	}
}
