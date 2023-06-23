package com.myfirstProject.myFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Demo {

	@Value("${datasource.url}")
	private String datasourceurl;

	@Value("${datasource.username}")
	private String username;

	@Value("${datasource.password}")
	private String password;

	public Connection getsqlConnection() {
		Connection con = null;
		try {

			String query = "select * from student";
			System.out.println("query me aa gya");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class.forName call ho gya");
			con = DriverManager.getConnection(datasourceurl, username, password);
  System.out.println("connection create ho gya ");
		} catch (Exception e) {
			System.out.println("db fat gya , " + e.getMessage());
		}
		System.out.println("connection return kr rha hu");
		return con;
	}
}
