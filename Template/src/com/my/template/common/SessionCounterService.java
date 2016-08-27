package com.my.template.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

public class SessionCounterService {
	Logger log = Logger.getLogger(SessionCounterService.class);
	public void printCounter(int count){
		log.info("Total session created: " + count);
	}

}
