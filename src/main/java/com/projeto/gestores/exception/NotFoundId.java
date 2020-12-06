package com.projeto.gestores.exception;

public class NotFoundId extends Exception {


	private static final long serialVersionUID = 1L;
	
	

	public NotFoundId() {
		super();
		
	}

	public NotFoundId(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NotFoundId(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NotFoundId(String message) {
		super(message);
		
	}

	public NotFoundId(Throwable cause) {
		super(cause);
		
	}

}
