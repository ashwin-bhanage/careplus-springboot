package com.careplus.exception;

public class DoubleBookingException extends RuntimeException {

	public DoubleBookingException(String message) {
		super(message);
	}
}