package br.unitins.emidia.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MessageController implements Serializable {
	private static final long serialVersionUID = -7784765212601244252L;
	
	private String name;
	private String email;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String sendMessage() {
		boolean isNameOk = this.name.length() > 0;
		boolean isEmailOk = this.email.length() > 0;
		
		if (isNameOk && isEmailOk) {
			return "success.xhtml";
		}
		
		return "fail.xhtml";
	}
}
