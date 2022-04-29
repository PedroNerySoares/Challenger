package br.com.alura.challenger.services;

import java.util.Random;

import org.springframework.security.crypto.bcrypt.BCrypt;


public class CriptografiaService {
	private String password="";
	private String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
	
	public void  ckeckPass(String password) {
		
		
		
		System.out.println(hashedPassword);
		if(BCrypt.checkpw(password,hashedPassword)) {
			System.out.println("passwor ok");
		}else {
			System.out.println("no match");
		}
	}
	
	public String GerarHash(String pass){
		return BCrypt.hashpw(pass, BCrypt.gensalt(10));
		
	}
}
