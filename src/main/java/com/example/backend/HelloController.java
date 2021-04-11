package com.example.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World from Sofiya";
	}

//	@RequestMapping(path = "/")
//	public String home(HttpServletRequest request) {
//
//		String contextPath = request.getContextPath();
//		String host = request.getServerName();
//
//		// Spring Boot >= 2.0.0.M7
//		String endpointBasePath = "/actuator";
//
//		StringBuilder sb = new StringBuilder();
//
//		sb.append("<h2>Sprig Boot Actuator</h2>");
//		sb.append("<ul>");
//
//		// http://localhost:8090/actuator
//		String url = "http://" + host + ":8000" + contextPath + endpointBasePath;
//
//		sb.append("<li><a href='" + url + "'>" + url + "</a></li>");
//
//		sb.append("</ul>");
//
//		return sb.toString();
//	}

}
