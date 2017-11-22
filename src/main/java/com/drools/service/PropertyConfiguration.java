package com.drools.service;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyConfiguration {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PropertyConfiguration.class);
	
	public static String getValueForProperty(String propertyName) {
		
		String value = System.getProperty("cisco.life");
		String propFile = "";
		if(value!=null){
			 propFile = "application_"+ value;
		}else{
			propFile = "application_dev";
		}
		ResourceBundle bundle = ResourceBundle.getBundle(propFile);
		LOGGER.debug("The value of the property" + propertyName + " is : " + bundle.getString(propertyName));
		return bundle.getString(propertyName);
	}
}
