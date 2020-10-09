package com.bootcamp.dsclient.resources.exceptions;

import java.time.Instant;

public class StandardError {

	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String errorString) {
		this.error = errorString;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String messageString) {
		this.message = messageString;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
