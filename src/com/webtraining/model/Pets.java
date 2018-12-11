package com.webtraining.model;

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

    public String getCategory(){
        if(type.equalsIgnoreCase("dog"))
            return  "Canine";
        else if(type.equalsIgnoreCase("cat"))
            return "Pheline";
            else
                return "other";
    }
}
