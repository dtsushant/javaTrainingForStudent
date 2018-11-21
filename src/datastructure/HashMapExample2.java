package datastructure;

import model.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample2 {

    public static void main(String args[]){
        HashMap<String,ArrayList<Pets>> countryOfPets = new HashMap<>();

        ArrayList<Pets> nepalList = new ArrayList();
        nepalList.add(new Pets("kale","Dog",4,"Black",true,13.0));
        nepalList.add(new Pets("Rani","Cat",4,"Black & white",true,6.0));
        nepalList.add(new Pets("Mitho","Parrot",4,"Green",false,0.3));

        countryOfPets.put("Nepal", nepalList);

        ArrayList<Pets> englishList = new ArrayList();
        englishList.add(new Pets("Doggo","Dog",4,"Black",true,13.0));
        englishList.add(new Pets("Catto","Cat",4,"Black & white",true,6.0));
        englishList.add(new Pets("Parroto","Parrot",4,"Green",false,0.3));

        countryOfPets.put("England", englishList);

        ArrayList<Pets> germanList = new ArrayList();
        germanList.add(new Pets("German Doggo","Dog",4,"Black",true,13.0));
        germanList.add(new Pets("German Catto","Cat",4,"Black & white",true,6.0));
        germanList.add(new Pets("German Parroto","Parrot",4,"Green",false,0.3));


        countryOfPets.put("German",germanList);

        Iterator<String> coutrySets = countryOfPets.keySet().iterator();

        while (coutrySets.hasNext()){
            String countryName = coutrySets.next();

            ArrayList<Pets> list = countryOfPets.get(countryName);

            System.out.println("\n\n\n\nShowing Pets name for country : "+ countryName);
            System.out.println();
            for(Pets p : list){
                System.out.println(" the name of the pet :" +p.getName());
                System.out.println("the type of pet " +p.getType());
                System.out.println(" the age of Pet " +p.getAge());
                System.out.println(" the color of Pet " +p.getColor());
                System.out.println(" the weight of pet " +p.getWeight());
                System.out.println(" is pet vaccinated " +p.isVaccinated());
            }
        }
    }
}
