package com.example.whatsapp.Models;

public class Users {

    String profile_pic;

    public Users(String profile_pic, String userName, String mail, String password, String lastMessage) {
        this.profile_pic = profile_pic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    String userName;
    String mail;
    String password;
    String lastMessage;
    String userId;

    public Users(){}

        //signUp constructor
        public Users(String userName, String mail, String password) {

            this.userName = userName;
            this.mail = mail;
            this.password = password;

        }




    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getUserId(String key) {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
