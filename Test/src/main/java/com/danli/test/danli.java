package com.danli.test;

public enum danli {
	
	INSTANCE;
	
	private String string=name();
	
	public String getString(){
		return string;
	}
	
	public void setString(String string){
		this.string=string;	
	}
	
	public void test(){
		System.out.println("²âÊÔ¿ªÊ¼¡£¡£¡£");
	}

}
