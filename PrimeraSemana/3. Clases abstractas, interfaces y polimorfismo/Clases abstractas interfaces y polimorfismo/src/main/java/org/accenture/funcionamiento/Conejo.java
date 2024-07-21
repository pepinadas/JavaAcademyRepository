package org.accenture.funcionamiento;

public class Conejo implements Animal{
    @Override
    public void reaccionar(boolean x) {
        if (x == true) {
            System.out.println("Es suave");
        } else {
            System.out.println("Te mira fijamente");
        }
    }
}
