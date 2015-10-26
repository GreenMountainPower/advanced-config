package com.example;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.config.AdvancedConfig;
import com.example.config.NestedConfig;
import com.example.model.DatabaseConfig;
import com.example.model.JdbcConnections;
import com.example.model.Person;

@Service
public class TestConfig {

	@Autowired
	AdvancedConfig config;
	
	@Autowired
	NestedConfig nestedConfig;
	
	@Value("${nested.some.value}")
	private String nestedVal; 
	
	@PostConstruct
	private void init() {
		//Basic values
		System.out.println("intVal: " + config.getIntVal());
		System.out.println("stringVal: " + config.getStringVal());
		
		//List values
		for(int i = 0; i < config.getListVal().size(); i++) {
			System.out.println(String.format("List item %d: %s", i+1, config.getListVal().get(i)));
		}
		
		//Map values
		for(Map.Entry<String, String> entry : config.getMapVal().entrySet()) {
			System.out.println("Map key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		//POJO mapping
		Person person = config.getPerson();
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		for(String interest : config.getPerson().getInterests()) {
			System.out.println("Interest: " + interest);
		}
		
		//Complex example of POJO containing map of other POJO
		JdbcConnections jdbc = config.getJdbcConnections();
		System.out.println("jdbcConnections.driverClassName: " + jdbc.getDriverClassName());
		
		DatabaseConfig databaseConfig1 = jdbc.getDatabases().get("database1");
		System.out.println("database1.url: " + databaseConfig1.getUrl());
		System.out.println("database1.username: " + databaseConfig1.getUsername());
		System.out.println("database1.password: " + databaseConfig1.getPassword());
		
		DatabaseConfig databaseConfig2 = jdbc.getDatabases().get("database2");
		System.out.println("database2.url: " + databaseConfig2.getUrl());
		System.out.println("database2.username: " + databaseConfig2.getUsername());
		System.out.println("database2.password: " + databaseConfig2.getPassword());
		
		//@Value nested values
		System.out.println("nestedVal: " + nestedVal);
		
		//Deeply nested value using separate config class
		System.out.println("deeply nested value: " + nestedConfig.getValue());

	}
}
