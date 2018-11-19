package model;

public class Pets {

    private String name;
    private String type;
    private Integer     age;
    private String  color;
    private boolean isVaccinated;
    private Double  weight;

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
}
