package com.my.template.action;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.my.template.common.Testing;
import com.my.template.common.TestingAnnotationService;

@Controller
@RequestMapping("/hello")
public class HelloAction {

	@Resource TestingAnnotationService testingAnnotationService;
	@Resource Testing testing;
	private Logger log = Logger.getLogger(HelloAction.class);
	@RequestMapping("/say")
	public String hello(HttpServletRequest request, HttpServletResponse response, Model model, Map<String, Object> map, Date date){
		log.info("hello start..");
		testingAnnotationService.testAnnotation();
		testing.test();
		model.addAttribute("name", "World");
		map.put("MapAttribute", "Myself");
		return "hello";
	}
	
	@RequestMapping("ajaxSay")
	public void ajaxHello(String name, PrintWriter pw){
		log.info("ajaxHello start.."); 
		log.info(name);
		JSONArray json = new JSONArray();
		json.put("hello " + name);
		log.info(json.toString());
		pw.write(json.toString()); 
	}

}
