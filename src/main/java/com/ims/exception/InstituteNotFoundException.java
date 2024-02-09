package com.ims.exception;

public class InstituteNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InstituteNotFoundException() {
		super();
	}
	
	public InstituteNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InstituteNotFoundException(String message) {
		super(message);
	}
	
	public InstituteNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
}
