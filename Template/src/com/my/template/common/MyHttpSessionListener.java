package com.my.template.common;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

public class MyHttpSessionListener implements HttpSessionListener, HttpSessionAttributeListener{
	private static int totalActiveSession;
	Logger log = Logger.getLogger(MyHttpSessionListener.class);
//	@Resource TestingAnnotationService testingAnnotationService;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		log.info("one session created..");
		totalActiveSession++;
		printCounter(arg0);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	private void printCounter(HttpSessionEvent sessionEvent){
		HttpSession session = sessionEvent.getSession();
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
		SessionCounterService sessionCounterService = ctx.getBean(SessionCounterService.class);
		sessionCounterService.printCounter(totalActiveSession);
//		testingAnnotationService.testAnnotation();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
