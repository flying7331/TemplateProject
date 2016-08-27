package com.my.template.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestingAnnotationService {
	
	Logger log = Logger.getLogger(TestingAnnotationService.class);
	public void testAnnotation(){
		log.info("call annotation service..");
	}

}
