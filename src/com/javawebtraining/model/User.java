package com.javawebtraining.model;

import java.util.ArrayList;

public class User {


    Integer id;
    String username;
    String password;

    private static ArrayList<User> loginuser = new ArrayList<>();

    static {
        loginuser.add(new User(1,"admin","admin"));
        loginuser.add(new User(1,"test","test"));
        loginuser.add(new User(1,"test1","test1"));
    }


    public User(){

    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean login(){
        boolean bool = false;
        for(User u : loginuser){
            if(this.username.equals(u.username) && this.password.equals(u.password)){
                bool = true;
                break;
            }
        }
        return bool;
    }




}
