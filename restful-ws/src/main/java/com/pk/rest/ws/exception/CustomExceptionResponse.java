package com.pk.rest.ws.exception;

import java.util.Date;

public class CustomExceptionResponse {
	private Date errorTimeStamp;
	private String exceptionMessage;
	private String exceptionDetails;

	public Date getErrorTimeStamp() {
		return errorTimeStamp;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public String getExceptionDetails() {
		return exceptionDetails;
	}

	public CustomExceptionResponse(Date errorTimeStamp, String exceptionMessage, String exceptionDetails) {
		super();
		this.errorTimeStamp = errorTimeStamp;
		this.exceptionMessage = exceptionMessage;
		this.exceptionDetails = exceptionDetails;
	}

}
