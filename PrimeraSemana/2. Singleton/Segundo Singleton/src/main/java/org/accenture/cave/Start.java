package org.accenture.cave;

import java.util.Random;
import java.util.Scanner;

public class Start {

    // Aqui se crea una variable random que sera util mas tarde
    Random random = new Random();

    // Una instancia del singleton que nos permite pasar si quisieramos un numero para la vida en la cueva
    // Sin embargo aqui solamente le pasamos un random del 1 al 50.
    SingletonCave conn1 = SingletonCave.getInstance(random.nextInt(50));

    // Esta variable nos permitira conocer si hemos ganado o no
    boolean win = false;
    // Esto nos sera de ayuda para guardar valores que pasemos por consola
    Scanner scanner = new Scanner(System.in);

    public Start() {

        // Here are created 3 survivors as clue to try to guess the value.
        SingletonCave.doISurvive("Angel", random.nextInt(50));
        SingletonCave.doISurvive("Rafael", random.nextInt(50));
        SingletonCave.doISurvive("Esteban", random.nextInt(50));

        // Here the total number of visitors are shown, again as clue.
        System.out.println( "Visitors: " + SingletonCave.getNumberVisitors());
        // The name of the survivors.
        System.out.println("Survivors: " + SingletonCave.getSurvivors());

        while (win == false) {

            // Pide al usuario que introduzca un nombre
            System.out.print("Please introduce a name: ");
            String name = scanner.nextLine();

            // Pide al usuario que introduzca un numero para su vida
            System.out.print("Please introduce you life: ");
            String life = scanner.nextLine();

            // Asigna el return de el metodo para verificar si ha ganado el usuario.
            win = SingletonCave.doISurvive(name, Integer.parseInt(life));
        }


        scanner.close();
    }


}