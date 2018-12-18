package com.webtraining.model;

import java.util.ArrayList;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String fullName;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password,String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public User(Integer id, String username, String password, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public static ArrayList<User> getDummyUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"test","test","someone Noone"));
        users.add(new User(2,"admin","admin","somebody Nobodyne"));
        users.add(new User(3,"user","pass","koi koi"));
        return users;
    }

    //Please change this code to login from database table called user
    public static User login(String username, String password){
        System.out.println(username);
        System.out.println(password);
        User u = null;
        ArrayList<User> userLists = getDummyUser();

        for(User user : userLists){
            if(username.equals(user.username) && (password.equals(user.password))){
                u = user;
                break;
            }
        }



        return u;
    }
}