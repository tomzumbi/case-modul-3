package com.example.casestudymodul3.model;

public class Account {

    private String username;
    private String password;
    private String email;
    private String phonenumber;
    private String address;
    private String role;
    private String status;
    private String avatarurl;
    private int idrole;

    public Account(String username, String password, String email, String phonenumber, String address, String role, String status, String avatarurl, int idrole) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.role = role;
        this.status = status;
        this.avatarurl = avatarurl;
        this.idrole = idrole;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String password) {
        this.password = password;
    }

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = idrole;
    }
}
