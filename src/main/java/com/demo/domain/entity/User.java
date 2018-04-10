package com.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Alex
 */

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public User() {
	}

	public User(String userName, String passWord, String email, String nickName) {
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.nickName = nickName;
	}

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String passWord;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = true, unique = true)
	private String nickName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
