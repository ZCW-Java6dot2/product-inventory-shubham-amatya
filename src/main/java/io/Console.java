

package io;

import models.Cigar;
import services.CigarService;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {



    public static void printWelcome() {
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");

    }


    public static void initialUserInput() {


        System.out.println("Store opening... 3...2...1\n" +
                "Welcome to the money machine!");


        //while (powerOn) {
            System.out.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Cigar\n" +
                    "2 - Hat\n" +
                    "3 - Power Down\n" +
                    "---------------------------------\n" +

                    "---------------------------------\n" +
                    "Enter choice here: -> ");

        Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();







        }

    //}

        public void displayCigarInConsole(){
        int menuChoice = 0;
        int deleteId;
        int updateId;
        int chooseCigar;
        boolean powerOn = true;
        int id;
        String name;
        String brand;
        String shape;
        float size;
        int quantity;
        float price;

        CigarService cigarService = new CigarService();




        }


//            try {
//        int input = scanner.nextInt();
//                switch (input) {
//                    case 1:
//                        CigarService.findCigar(Cigar.getId());
//
//                        break;
//                    case 2:
//                        CigarService.findAll(Cigar.getId());
//                        break;
//                    case 3:
//                        CustomFeatures.customFeaturesOptions();
//                        break;
//                    case 4:
//                        Memory.memoryOptions();
//                        break;
//                    case 5:
//                        powerOn = false;
//                        System.out.println("Alrighty....fine. Powering down. (-_-)");
//                        break;
//                    default:
//                        System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
//                        break;
                }

























