package com.rao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	private long id;
	private String firstname;
	private String lastname;
	private String profile;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(String firstname, String lastname, String profile, String email, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.profile = profile;
		this.email = email;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="firsname")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="lastname")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name="profile")
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
