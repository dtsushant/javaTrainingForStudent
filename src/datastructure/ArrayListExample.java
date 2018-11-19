package datastructure;

import model.Pets;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String args[]){
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayList<String> stringArrayList = new ArrayList<>();

        ArrayList<Pets> petsList = new ArrayList<>();

        integerArrayList.add(99);

        integerArrayList.add(188);

        integerArrayList.add(37);

        System.out.println(integerArrayList);

        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(2));

        integerArrayList.add(1,72);

        System.out.println(integerArrayList);

        System.out.println(integerArrayList.get(2));


        stringArrayList.add("1");

        stringArrayList.add("ek");

        stringArrayList.add("uno");

        System.out.println(stringArrayList);

        stringArrayList.add(0,"One");

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(2));

        for(int i =0; i < integerArrayList.size(); i++){
            System.out.println(integerArrayList.get(i));
        }

        System.out.println("using for each loop :-------");
        for (int a: integerArrayList) {
            System.out.println(a);
        }

        System.out.println("using for each loop in String arraylist:-------");

        for(String  a : stringArrayList){
            System.out.println(a);
        }

        Pets pet = new Pets();
        pet.setName("Doggie");
        pet.setAge(7);
        pet.setColor("brown");
        pet.setType("Dog");
        pet.setWeight(23.1);
        pet.setVaccinated(true);

        petsList.add(pet);

        Pets pet1 = new Pets("Billi","Cat",8,"Black and White",true,7.0);

        petsList.add(pet1);

        petsList.add(new Pets("Chari","Bird",1,"black",false,0.1));

        Pets p = petsList.get(1);

        System.out.println("Printing pets information ======= >>>>> ");
        System.out.println(p.getName());
        System.out.println(p.getType());
        System.out.println(p.getAge());
        System.out.println(p.getColor());
        System.out.println(p.getWeight());
        System.out.println(p.isVaccinated());

    }
}
