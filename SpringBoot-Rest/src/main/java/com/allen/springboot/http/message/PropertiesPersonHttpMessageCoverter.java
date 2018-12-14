package com.allen.springboot.http.message;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Properties;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.allen.springboot.domain.Person;

public class PropertiesPersonHttpMessageCoverter extends AbstractHttpMessageConverter<Person> {

	public PropertiesPersonHttpMessageCoverter() {
		super(MediaType.valueOf("application/properties+person"));
		setDefaultCharset(Charset.forName("UTF-8"));
	}

	@Override
	protected boolean supports(Class<?> paramClass) {
		//必须是子类
		return paramClass.isAssignableFrom(Person.class);
	}

	//将请求内容中的properties内容转化为person对象
	@Override
	protected Person readInternal(Class<? extends Person> paramClass, HttpInputMessage paramHttpInputMessage)
			throws IOException, HttpMessageNotReadableException {
		/**
		 * person.id=10
           person.name=allen
		 */
		InputStream is=paramHttpInputMessage.getBody();
		Properties properties=new Properties();
		//将请求中的内容转化为properties
		properties.load(new InputStreamReader(is, getDefaultCharset()));
		//将properties内容转化到person对象中
		Person person=new Person();
		person.setId(Long.valueOf(properties.getProperty("person.id")));
		person.setName(properties.getProperty("person.name"));
		return person;
	}

	@Override
	protected void writeInternal(Person paramT, HttpOutputMessage paramHttpOutputMessage)
			throws IOException, HttpMessageNotWritableException {
		OutputStream os=paramHttpOutputMessage.getBody();
		Properties properties=new Properties();
		properties.setProperty("person.id", String.valueOf(paramT.getId()));
		properties.setProperty("person.name", paramT.getName());
		properties.store(new OutputStreamWriter(os, getDefaultCharset()), "first write");
	}
}
