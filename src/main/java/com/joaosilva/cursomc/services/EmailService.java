package com.joaosilva.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.joaosilva.cursomc.domain.Cliente;
import com.joaosilva.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}