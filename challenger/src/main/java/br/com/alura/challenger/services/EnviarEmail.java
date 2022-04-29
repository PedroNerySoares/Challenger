package br.com.alura.challenger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import br.com.alura.challenger.model.Usuario;

@Component
public class EnviarEmail {
	@Autowired
	private JavaMailSender mailSender;
	
	
	
	public void enviar(String usuario,String destinatario,String password) {
		
		SimpleMailMessage email = new SimpleMailMessage();
      
		email.setTo(destinatario);
        email.setSubject("Bem-Vindo ao Sistema PedroVerso");
        email.setText("Usuário:"+ usuario+ "\n Senha:"+ password);
        
        mailSender.send(email);
	}
}
