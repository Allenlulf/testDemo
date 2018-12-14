package com.allen.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.allen.springboot.domain.Person;

/**
 * {@link}{@link RestController}
 * @author lulf
 * @date 2018年11月14日
 */
@RestController
public class PersonController {
	
	
	@GetMapping("/person/{id}")
	public Person person(@PathVariable long id,@RequestParam(required=false) String name){
		Person person=new Person();
		person.setId(id);
		person.setName(name);
		return person;
	}
	
	
	@PostMapping(value="/person/json/to/properties",
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,//请求类型
			produces="application/properties+person" //响应内容
			)
	public Person personJsonToProperties(@RequestBody Person person){
		// @RequestBody 的内容是JSON
		// 响应的内容是properties
		return person;	
	}
	
	@PostMapping(value="/person/properties/to/json",
			consumes="application/properties+person",//请求类型
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE //响应内容
			)
	public Person personPropertiesToJson(@RequestBody Person person){
		// @RequestBody 的内容是Properties
		// 响应的内容是Json
		return person;	
	}
}
