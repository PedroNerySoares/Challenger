package br.com.alura.challenger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EnviarEmail {
	@Autowired
	private JavaMailSender mailSender;
	
	public void enviar() {
		SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("pedrohnery@gmail.com");
        email.setSubject("Teste envio de e-mail");
        email.setText("Enviei este e-mail usando Spring Boot.");
        mailSender.send(email);
	}
}
