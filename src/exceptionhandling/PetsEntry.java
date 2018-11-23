package exceptionhandling;

import model.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PetsEntry {



    public static void main(String args[]){

        HashMap<String,ArrayList<Pets>> countryPetsList = new HashMap<>();

        do{
            System.out.println("what do you want to do:-");
            System.out.println("Enter 1 to add Pet Information:-");
            System.out.println("Enter 2 to show Pets for a country:-");
            System.out.println("Enter 3 to show all the pets of all the country:-");
            System.out.println("Enter 4 to delete a pet:-");
            System.out.println("Enter 5 to delete a Country of Pets:-");
            System.out.println("Enter 6 to exit:-");

            Integer option = DataEntryTool.nextIntInRange(1,6);

            boolean breaker = false;
            String countryName;
            switch (option){
                case 1:
                    System.out.println("Enter Country u want to add Pets For");
                    countryName = DataEntryTool.next();
                    ArrayList<Pets> petList1 = countryPetsList.get(countryName);

                    if(petList1==null) {
                        petList1 = new ArrayList<>();
                        countryPetsList.put(countryName,petList1);
                    }

                    petList1.add(getPet());



                    break;
                case 2:
                    System.out.println("Enter Country u want to add Pets For");
                    countryName = DataEntryTool.next();
                    ArrayList<Pets> petList = countryPetsList.get(countryName);
                    if(petList!=null) {
                        System.out.println("Showing Pets for country "+ countryName);
                        showPets(petList);
                    }
                    break;
                case 3:
                    showAllPets(countryPetsList);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    breaker = true;
                    break;
            }

            if(breaker)
                break;

        }while (true);

        System.out.println("Bye Bye!");
    }



    public static Pets getPet(){
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

    }

    public static void showPets(ArrayList<Pets> list){
        System.out.println(" ===========================================================");
        for(Pets p : list){
            System.out.println("----------------------------------------------------------");
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

    public static void showAllPets( HashMap<String,ArrayList<Pets>> countryPetsList ){
        Iterator<String> coutrySets = countryPetsList.keySet().iterator();

        while (coutrySets.hasNext()) {
            String countryName = coutrySets.next();
            ArrayList<Pets> list = countryPetsList.get(countryName);
            System.out.println("Showing Pets for country "+ countryName);
            showPets(list);
        }

    }
}
