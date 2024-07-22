package org.accenture.funcionamiento;

public abstract class Terrestre implements Animal{

    // Valores por defecto.
    @Override
    public void reaccionar(boolean x) {
        if (x == true) {
            System.out.println("Es suave");
        } else {
            System.out.println("Te mira fijamente");
        }
    }
}
