package com.webtraining.model;

import com.webtraining.database.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Owner {
    private Integer id;
    private String fullname;
    private String address;
    private Integer phoneNo;

    public Owner() {
    }

    public Owner(String fullname, String address, Integer phoneNo) {
        this.fullname = fullname;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Owner(Integer id, String fullname, String address, Integer phoneNo) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean save(){
        boolean bool = false;
        try{
            Connection con = Connector.getConnection();
            String sql = "Insert into owner (fullname, address, phone_no) values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,this.fullname);
            stmt.setString(2,this.address);
            stmt.setInt(3,this.phoneNo);
            stmt.execute();
            bool = true;
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        return bool;
    }

    public static ArrayList<Owner> findAll(){
        ArrayList<Owner> owners = new ArrayList<>();
        try{
            Connection con = Connector.getConnection();
            String sql = "SELECT  * from owner";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Integer id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String address = rs.getString("address");
                Integer phone = rs.getInt("phone_no");

                Owner on = new Owner(id,fullname,address,phone);
                owners.add(on);
            }
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        return owners;
    }
}
