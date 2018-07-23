package com.epoint.test;

public class test1111 {
	  public static void main(String[] args) {
	        String str="1,2,3";
	        String value="";
	        String [] chr=str.split(",");
	        for (String string : chr) {
	            if(!"2".equals(string)){
	                value+=string+",";
	            }
	        }
	        System.out.println(value);
	        
	    }
}
