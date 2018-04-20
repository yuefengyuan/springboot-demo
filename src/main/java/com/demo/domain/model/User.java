package com.demo.domain.model;

public class User {
    private Long id;

    private String userName;

    private String email;

    private String password;

    private String nickName;

    public User(Long id, String userName, String email, String password, String nickName) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
    }

    public User() {
        super();
    }

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }
}