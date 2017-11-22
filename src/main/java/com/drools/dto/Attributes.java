package com.drools.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"id","type","clientAppId","status"})
public class Attributes implements Serializable {

	private static final long serialVersionUID = -7731384413903653339L;
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("clientAppId")
	private String clientAppId;
	@JsonProperty("status")
	private boolean status=false;

	public Attributes(String id, String type, String clientAppId) {
		super();
		this.id = id;
		this.type = type;
		this.clientAppId = clientAppId;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getClientAppId() {
		return clientAppId;
	}


	public void setClientAppId(String clientAppId) {
		this.clientAppId = clientAppId;
	}


	
	

}
