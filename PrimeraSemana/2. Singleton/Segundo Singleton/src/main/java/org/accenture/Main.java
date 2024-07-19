package org.accenture;

import org.accenture.cave.SingletonCave;
import org.accenture.cave.Start;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the cave, please try to discover the life needed to survive here.");
        System.out.println("Clue: You need a number between 0 and 50");

        Start start = new Start();
        boolean win = false;


        Scanner scanner = new Scanner(System.in);

        while (win == false) {
            // Pide al usuario que introduzca un nombre
            System.out.print("Please introduce a name: ");
            String name = scanner.nextLine();

            System.out.print("Please introduce you life: ");
            String life = scanner.nextLine();

            win = SingletonCave.doISurvive(name, Integer.parseInt(life));
        }





        scanner.close();
    }
}