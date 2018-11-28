package database;

import exceptionhandling.DataEntryTool;
import model.Pets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class PetsInformation {
    public static void main(String args[]) {
        HashMap<String, ArrayList<Pets>> countryPetsList = new HashMap<>();

        do {
            System.out.println("what do you want to do:-");
            System.out.println("Enter 1 to add new Pet Information:-");
            System.out.println("Enter 2 Show all Pets:-");
            System.out.println("Enter 3 Show all pets of type:-");
            System.out.println("Enter 4 Update Pet Information:-");
            System.out.println("Enter 5 Delete Pet information:-");
            System.out.println("Enter 6 to exit:-");

            Integer option = DataEntryTool.nextIntInRange(1, 6);

            boolean breaker = false;
            switch (option){
                case 1:
                    addNewPet();
                    break;
                case 2:
                    showPets(findAllPets());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    breaker = true;
            }

            if(breaker)
                break;
        } while (true);

        System.out.println("GoodBye!!!!!");
    }

    public static void addNewPet(){
        Connection con = null;
        try{
            con = Connector.getConnection();
            String sql = "insert into pets(name, type, age, color, weight,is_vaccinated) value(?,?,?,?,?,?)";
            Pets pet = getPetInfoFromUser();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,pet.getName());
            stmt.setString(2,pet.getType());
            stmt.setInt(3,pet.getAge());
            stmt.setString(4,pet.getColor());
            stmt.setDouble(5,pet.getWeight());
            stmt.setBoolean(6,pet.isVaccinated());

            stmt.execute();
            con.close();


        }catch (Exception ex){
            System.out.println(ex.toString());
        }

    }

   public static ArrayList<Pets> findAllPets(){
        ArrayList<Pets> pets = new ArrayList<>();
        Connection con = null;
        try{
            String sql = "select * from pets";
            con = Connector.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                Integer id  = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                Integer age = rs.getInt("age");
                String color = rs.getString("color");
                Double weight = rs.getDouble("weight");
                Boolean isVaccinated = rs.getBoolean("is_vaccinated");

                Pets p = new Pets(id,name,type,age,color,isVaccinated,weight);
                pets.add(p);
            }
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        return pets;
   }

    public static Pets getPetInfoFromUser(){
        Pets pet = new Pets();
        System.out.println("Enter Pet Name:-");
        pet.setName(DataEntryTool.next());
        System.out.println("Enter Pet Color:-");
        pet.setColor(DataEntryTool.next());
        System.out.println("Enter Pet Age:-");
        pet.setAge(DataEntryTool.nextInt());
        System.out.println("Enter Pet Weight:-");
        pet.setWeight(DataEntryTool.nextDouble());
        System.out.println("Enter Pet Type:-");
        pet.setType(DataEntryTool.next());
        System.out.println("Enter 0 for vaccinated 1 for not vaccinated:-");
        boolean isVaccinated = DataEntryTool.nextIntInRange(0,1)==1;
        pet.setVaccinated(isVaccinated);
        return pet;
    };

    public static void showPets(ArrayList<Pets> list){
        System.out.println(" ===========================================================");
        for(Pets p : list){
            System.out.println("----------------------------------------------------------");
            System.out.println(" the id of the pet :" +p.getId());
            System.out.println(" the name of the pet :" +p.getName());
            System.out.println("the type of pet " +p.getType());
            System.out.println(" the age of Pet " +p.getAge());
            System.out.println(" the color of Pet " +p.getColor());
            System.out.println(" the weight of pet " +p.getWeight());
            System.out.println(" is pet vaccinated " +p.isVaccinated());
            System.out.println("----------------------------------------------------------");

        }
        System.out.println(" ===========================================================");

    }



}
