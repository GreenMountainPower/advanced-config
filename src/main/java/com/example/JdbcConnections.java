package com.example;

import java.util.Map;

public class JdbcConnections {
	private String driverClassName;
	private Map<String, DatabaseConfig> databases;
	
	public String getDriverClassName() {
		return driverClassName;
	}
	
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public Map<String, DatabaseConfig> getDatabases() {
		return databases;
	}

	public void setDatabases(Map<String, DatabaseConfig> databases) {
		this.databases = databases;
	}
}
