package com.rao.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {
	
	private String firstname;
	private String lastname;
	private String profie;
	private String email;
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	
	@XmlElement
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	@XmlElement
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getProfie() {
		return profie;
	}
	
	@XmlElement
	public void setProfie(String profie) {
		this.profie = profie;
	}
	
	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
}
