package org.accenture.cave;

import java.util.Random;

public class Start {

        Random random = new Random();
        SingletonCave conn1 = SingletonCave.getInstance(random.nextInt(50));

    public Start() {
        SingletonCave.doISurvive("Angel", random.nextInt(50));
        SingletonCave.doISurvive("Rafael", random.nextInt(50));
        SingletonCave.doISurvive("Esteban", random.nextInt(50));
        System.out.println( "Visitors: " + SingletonCave.getNumberVisitors());

        System.out.println("Survivors: " + SingletonCave.getSurvivors());
    }


}