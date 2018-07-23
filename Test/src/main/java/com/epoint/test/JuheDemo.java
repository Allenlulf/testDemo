package com.epoint.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JuheDemo {
	
	
	public static void main(String[] args) {
        String httpUrl = "http://apis.baidu.com/apistore/currencyservice/currency";
        String httpArg = "fromCurrency=USD&toCurrency=CNY&amount=1";
        String jsonResult = newRequest(httpUrl, httpArg);
        System.out.println(jsonResult);
    }
	
	 public static String newRequest(String httpUrl, String httpArg) {
	        BufferedReader reader = null;
	        String result = null;
	        StringBuffer sbf = new StringBuffer();
	        httpUrl = httpUrl + "?" + httpArg;
	        try {
	            URL url = new URL(httpUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");
	            // ÃÓ»ÎapikeyµΩHTTP header
	            connection.setRequestProperty("apikey", "Tszjznrv7DrIc3G33NP7TENpYmiKe91R");
	            connection.connect();
	            InputStream is = connection.getInputStream();
	            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	            String strRead = null;
	            while ((strRead = reader.readLine()) != null) {
	                sbf.append(strRead);
	                sbf.append("\r\n");
	            }
	            reader.close();
	            result = sbf.toString();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
}