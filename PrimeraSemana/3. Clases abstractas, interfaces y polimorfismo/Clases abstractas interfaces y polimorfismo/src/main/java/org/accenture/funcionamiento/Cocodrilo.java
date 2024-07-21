package org.accenture.funcionamiento;

public class Cocodrilo implements Animal{
    @Override
    public void reaccionar(boolean x) {
        if (x == true) {
            System.out.println("Te mordio");
        } else {
            System.out.println("No pasa nada");
        }

    }
}
