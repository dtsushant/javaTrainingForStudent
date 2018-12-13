package com.webtraining.model;

import com.webtraining.database.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Pets {
    private Integer id;
    private String name;
    private String type;
    private Integer     age;
    private String  color;
    private boolean isVaccinated;
    private Double  weight;
    private Owner owner;

    public Pets() {
    }



    public Pets(String name, String type, Integer age, String color, boolean isVaccinated, Double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.weight = weight;
    }

    public Pets(Integer id, String name, String type, Integer age, String color, boolean isVaccinated, Double weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.weight = weight;
    }

    public Pets(Integer id, String name, String type, Integer age, String color, boolean isVaccinated, Double weight, Owner owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.weight = weight;
        this.owner = owner;
    }

    public Pets(String name, String type, Integer age, String color, boolean isVaccinated, Double weight, Owner owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.weight = weight;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getCategory(){
        if(type.equalsIgnoreCase("dog"))
            return  "Canine";
        else if(type.equalsIgnoreCase("cat"))
            return "Pheline";
            else
                return "other";
    }


    public boolean save(){
        boolean bool = false;
        try{
            Connection con = Connector.getConnection();
            String sql = "Insert into pets (name,type,age,is_vaccinated,color,weight,owner_id) values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,this.name);
            stmt.setString(2,this.type);
            stmt.setInt(3,this.age);
            stmt.setBoolean(4,this.isVaccinated);
            stmt.setString(5,this.color);
            stmt.setDouble(6,this.weight);
            stmt.setInt(7,this.owner.getId());
            stmt.execute();
            bool = true;
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        return bool;
    }


    public static ArrayList<Pets> findAll(){
        ArrayList<Pets> pets = new ArrayList<>();
        try{
            Connection con = Connector.getConnection();
            String sql = "SELECT  * from pets";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String color = rs.getString("color");
                Integer age = rs.getInt("age");
                Double weight = rs.getDouble("weight");
                Boolean isVaccinated= rs.getBoolean("is_vaccinated");
                Owner owner= Owner.get(rs.getInt("owner_id"));

                pets.add(new Pets(id,name,type,age,color,isVaccinated,weight,owner));

            }
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        return pets;
    }


}
