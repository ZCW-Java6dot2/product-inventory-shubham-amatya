package services;

import models.Cigar;
import models.Hat;

import java.util.ArrayList;

public class HatService {

    Hat H1 = new Hat();

    private static int nextId = 1;

    private static ArrayList<Hat> inventory = new ArrayList<>();

    public static Hat create(int id, String name, String brand, String color,
                               float size, int quantity, float price){

        Hat createdHat = new Hat(nextId++, name, brand, color, size, quantity, price);
        inventory.add(createdHat);
        return createdHat;


    }

    public Hat findHat(int id){
        if (inventory.contains(id)){
            return (inventory.get(id));
        } else{
            System.out.println("The item with that Id does not exist :(");
        }

        return (inventory.get(id));
    }


    public Hat[] findAll(){
        //will return all the values inside the arraylist containing all the cigars in the inventory

        Hat[] hatArr = new Hat[inventory.size()];
        int i=0;
        while (i<hatArr.length){
            hatArr[i] = inventory.get(i);
            //does not store the value yet
            i++;
        }
        return hatArr;
    }

    public boolean delete(int id){
        //remove a particular item with the same id
        for (Hat h: inventory){
            if(h.getId()==id){
                inventory.remove(h);
                return true;
            }
        }
        return false;
    }

}





