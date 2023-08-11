package com.furlencoapp.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatusCode;

public class ApiErrors {
	
	private String message;
    private HttpStatusCode status;
    private LocalDateTime timestamp;
    private String error;

	public ApiErrors(String message, HttpStatusCode status, LocalDateTime timestamp, String error) {
		super();
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatusCode getStatus() {
		return status;
	}

	public void setStatus(HttpStatusCode status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
    
    
	
}
