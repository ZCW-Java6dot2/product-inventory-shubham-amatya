package services;

import com.sun.deploy.net.MessageHeader;
import io.CSVUtils;
import models.Cigar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CigarService {

    Cigar C1 = new Cigar();



    private static int nextId = 1;

    private static ArrayList<Cigar> inventory = new ArrayList<>();

    public static Cigar create(int id, String name, String brand, String shape,
                               float size, int quantity, float price){

        Cigar createdCigar = new Cigar(nextId++, name, brand, shape, size, quantity, price);
        inventory.add(createdCigar);
        return createdCigar;


        }

        public static Cigar findCigar(int id){
        if (inventory.contains(id)){
            return (inventory.get(id));
        } else{
            System.out.println("The item with that Id does not exist :(");
        }

        return (inventory.get(id));
        }


        public static Cigar[] findAll(){
        //will return all the values inside the arraylist containing all the cigars in the inventory

            Cigar[] cigarArr = new Cigar[inventory.size()];
            int i=0;
            while (i<cigarArr.length){
                cigarArr[i] = inventory.get(i);
                //does not store the value yet
                i++;
            }
            return cigarArr;
        }

        public boolean delete(int id){
        //remove a particular item with the same id
            for (Cigar C: inventory){
                if(C.getId()==id){
                    inventory.remove(C);
                    return true;
                }
            }
         return false;
        }

        public void printToFile() throws IOException {

            String csvFile = "/Users/shubham/Dev/Cigar.csv";
            FileWriter writer = new FileWriter(csvFile); //(1)

            CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

            for (Cigar C : inventory) {
                List<String> list = new ArrayList<>(); // (3)
                list.add(String.valueOf(C.getId()));
                list.add(C.getName());
                list.add(C.getBrand());
                list.add(C.getShape());
                list.add(String.valueOf(C.getQuantity()));
                list.add(String.valueOf(C.getPrice()));

                CSVUtils.writeLine(writer, list);  // (4)
            }

// (5)
            writer.flush();
            writer.close();

        }

        public void loadData(){
            String csvFile = "/Users/shubham/Dev/Cigar.csv";
            String line = "";
            String csvSplitBy = ",";


            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                nextId = (int)Integer.parseInt(br.readLine());

                while ((line = br.readLine()) != null) {
                    // split line with comma
                    String[] cig = line.split(csvSplitBy);

                    // (4)
                    int id = Integer.parseInt(cig[0]);
                    String name = cig[1];
                    String brand = cig[2];
                    int qty = Integer.parseInt(cig[3]);


                    // (5)
                    inventory.add(new Cigar(id, name, brand,qty));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


















}




