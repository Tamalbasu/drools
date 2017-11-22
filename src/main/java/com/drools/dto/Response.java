/*package com.cisco.container.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"reasonCode","message","resourses"})
public class Response {
	@JsonProperty("reasonCode")
	private int reasonCode;
	@JsonProperty("message")
	private String status="Not elegible for any resources";
	@JsonProperty("resourses")
	private ArrayList<String> resourses=new ArrayList<String>();
	
	
	
	public int getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<String> getResourses() {
		return resourses;
	}
	public void setResourses(ArrayList<String> resourses) {
		this.resourses = resourses;
	}
	
	
	
	
}
*/



package com.drools.dto;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Response {

	private int reasonCode;
	private String message = Constants.RESOURCES_NOTELIGIBLE;
	private ArrayList<String> resourses = new ArrayList<String>();

	public int getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<String> getResourses() {
		return resourses;
	}

	public void setResourses(ArrayList<String> resourses) {
		this.resourses = resourses;
	}

}
