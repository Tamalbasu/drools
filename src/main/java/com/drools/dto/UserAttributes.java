package com.drools.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserAttributes implements Serializable {

	private static final long serialVersionUID = -7731384413903653339L;

	private String id;
	private String type;
	private String loggedId;
	private boolean status = false;

	public UserAttributes() {

	}

	public UserAttributes(String id, String type, String loggedId) {
		super();
		this.id = id;
		this.type = type;
		this.loggedId = loggedId;
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

	public String getLoggedId() {
		return loggedId;
	}

	public void setLoggedId(String loggedId) {
		this.loggedId = loggedId;
	}

}
