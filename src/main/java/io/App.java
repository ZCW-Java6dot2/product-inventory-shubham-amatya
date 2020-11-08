
package io;

import services.CigarService;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

    private CigarService sigarService = new CigarService();

    public static void main(String[] args) {
        App application = new App();
        application.init();
    }

    public void init(){
        Console.printWelcome();
        Console.initialUserInput();


    }




}

