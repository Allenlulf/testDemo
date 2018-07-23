package com.llf.Exception;

public class MyRunExceptionTest {
	public static void main(String[] args) {
		String value="SBCQ";
		if(value.equals("SBCQ")){
			throw new MyRunException("SBCQ «“ªÃıœÃ”„");
		}
	}
}
