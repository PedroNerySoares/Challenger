package br.com.alura.challenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.activation.DataSource;




@SpringBootApplication
public class ChallengerAluraApplication {

	public static void main(String[] args) {
		
	
				
		SpringApplication.run(ChallengerAluraApplication.class, args);
	}

}
