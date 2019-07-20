package com.frost.exception;

public class CustomDSException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomDSException(String errorMsg) {
		super(errorMsg);
	}

}
