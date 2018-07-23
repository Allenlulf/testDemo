package com.llf.Exception;

/**
 * 运行时异常类
 * @author lulf
 * 2018年7月2日
 */
public class MyRunException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 错误编码
	 */
	private String errorCode;
	
	/**
	 * 消息是否为属性文件的key
	 */
	private boolean propertiesKey=true; 
	
	public MyRunException(String message){
		super(message);
	}
	
	public MyRunException(String errorCode,String message,Throwable cause){
		this(errorCode,message,cause,true);
	}
	
	public MyRunException(String errorCode,String message){
		this(errorCode, message, true);
	}

	public MyRunException(String errorCode, String message, boolean propertiesKey) {
		super(message);
		this.setErrorCode(errorCode);
	    this.setPropertiesKey(propertiesKey);
	}
	
	public MyRunException(String errorCode, String message,Throwable cause, boolean propertiesKey) {
		super(message,cause);
		this.setErrorCode(errorCode);
	    this.setPropertiesKey(propertiesKey);
	}
	
	public MyRunException(String message,Throwable cause){
		super(message,cause);
	}
	
     public MyRunException(){
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isPropertiesKey() {
		return propertiesKey;
	}

	public void setPropertiesKey(boolean propertiesKey) {
		this.propertiesKey = propertiesKey;
	}
}
