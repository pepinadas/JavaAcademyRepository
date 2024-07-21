package org.accenture;

import org.accenture.funcionamiento.Animal;
import org.accenture.funcionamiento.Cocodrilo;
import org.accenture.funcionamiento.Conejo;

import java.util.Random;
import java.util.Scanner;

public class Principal  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(2);

        Animal animal = new Conejo();

        if (randomNumber == 1) {
            animal = new Cocodrilo();
        }

        String input = "1";




        while (input.equals("1") || input.equals("2")) {
            System.out.println("Ves a un animal salvaje, que haces?");
            System.out.println("1. Acariciar");
            System.out.println("2. No hacer nada");
            System.out.println("3. Salir");

            input = scanner.nextLine();

            if (input.equals("1")) {
                animal.reaccionar(true);
            } else if(input.equals("2")) {
                animal.reaccionar(false);
            }

            randomNumber = random.nextInt(2);

            if (randomNumber == 1) {
                animal = new Cocodrilo();
            } else {
                animal = new Conejo();
            }
        }





    }
}