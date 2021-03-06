package com.example.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.model.JdbcConnections;
import com.example.model.Person;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="config")
public class AdvancedConfig {
	private int intVal;
	private String stringVal;
	private List<String> listVal;
	private Map<String, String> mapVal;
	private Person person;
	private JdbcConnections jdbcConnections;

	public int getIntVal() {
		return intVal;
	}

	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}

	public String getStringVal() {
		return stringVal;
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}

	public List<String> getListVal() {
		return listVal;
	}

	public void setListVal(List<String> listVal) {
		this.listVal = listVal;
	}

	public Map<String, String> getMapVal() {
		return mapVal;
	}

	public void setMapVal(Map<String, String> mapVal) {
		this.mapVal = mapVal;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public JdbcConnections getJdbcConnections() {
		return jdbcConnections;
	}

	public void setJdbcConnections(JdbcConnections jdbcConnections) {
		this.jdbcConnections = jdbcConnections;
	}
}
