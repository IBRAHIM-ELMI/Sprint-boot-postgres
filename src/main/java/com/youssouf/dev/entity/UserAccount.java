package com.youssouf.dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_account")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "User_Name")
	private String user_name;
	@Column(name = "Passeword")
	private String passeword;
	@Column(name = "Email")
	private String email;

	public UserAccount() {
	}

	public UserAccount(String user_name, String passeword, String email) {
		this.user_name = user_name;
		this.passeword = passeword;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPasseword() {
		return passeword;
	}

	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
