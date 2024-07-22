package org.accenture;

import org.accenture.funcionamiento.Animal;
import org.accenture.funcionamiento.Cocodrilo;
import org.accenture.funcionamiento.Conejo;

import java.util.Random;
import java.util.Scanner;

public class Principal  {
    public static void main(String[] args) {
        //Scanner necesario para guardar lo que se mande por consola
        Scanner scanner = new Scanner(System.in);
        //Nos ayuda a crear una valor random
        Random random = new Random();
        //Guardamos un valor random del 0 al 2 y lo guardamos.
        int randomNumber = random.nextInt(2);

        //Creamos una instancia de la clase Animal por defecto
        Animal animal = new Conejo();

        // Si el valor que obtuvimos en el random es 1 cambiamos al Animal por un cocodrilo
        if (randomNumber == 1) {
            animal = new Cocodrilo();
        }

        // Creamos un valor que nos ayudara a entrar al bucle, y despues sera donde guardemos lo que pasemos por consola.
        String input = "1";




        // Bucle interactivo, si escribimos algo diferente a 1 o 2 termina la aplicacion
        while (input.equals("1") || input.equals("2")) {
            System.out.println("Ves a un animal salvaje, que haces?");
            System.out.println("1. Acariciar");
            System.out.println("2. No hacer nada");
            System.out.println("3. Salir");

            // Nos guarda lo que mandemos por consola.
            input = scanner.nextLine();

            // Si pasamos un 1 pasamos reaccionar como true, si no como false, implicando que no reaccionamos al animal
            if (input.equals("1")) {
                animal.reaccionar(true);
            } else if(input.equals("2")) {
                animal.reaccionar(false);
            }

            // Nos guarda un numero random que nos ayudara a elegir un nuevo animal que nos aparecera.
            randomNumber = random.nextInt(2);

            if (randomNumber == 1) {
                animal = new Cocodrilo();
            } else {
                animal = new Conejo();
            }
        }





    }
}