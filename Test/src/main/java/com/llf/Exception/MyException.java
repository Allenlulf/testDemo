package com.llf.Exception;
/**
 * ºÏ≤È–‘“Ï≥£
 * @author lulf
 */
public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public MyException(Throwable cause){
		super(cause);
	}
}
