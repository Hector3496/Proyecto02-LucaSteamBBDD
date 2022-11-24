package com.ejemplos.spring.controller.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.ejemplo.spring.controller.VideojuegoController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes { 
	private static final Logger logger = LoggerFactory.getLogger(VideojuegoController.class);
	
	private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) { 
		logger.info("------ getErrorAttributes(): " + options);
		Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
		logger.info("------ getErrorAttributes(): " + options);		
		
		Object timestamp = errorAttributes.get("timestamp");
		if (timestamp == null) { 
			errorAttributes.put("timestamp", dateFormat.format(new Date()));
			errorAttributes.put("infoadicional", "-------------------eres un tonto");

		} else { 
			errorAttributes.put("timestamp", dateFormat.format((Date) timestamp));
			errorAttributes.put("infoadicional", "-------------------eres un lechón");
		}

		errorAttributes.remove("trace");

		errorAttributes.put("jdk", System.getProperty("java.version"));

		errorAttributes.put("infoadicional", "eres muuuuuuuuuuuuuuuuuuuu tonto");		

		return errorAttributes;
	}
}
