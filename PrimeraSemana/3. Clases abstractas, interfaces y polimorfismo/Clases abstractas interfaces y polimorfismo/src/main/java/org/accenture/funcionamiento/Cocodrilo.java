package org.accenture.funcionamiento;

public class Cocodrilo extends Terrestre{

    // Sobre escribe reaccionar, ya que es diferente su comportamiento.
    @Override
    public void reaccionar(boolean x) {
        if (x == true) {
            System.out.println("Te mordio");
        } else {
            System.out.println("No pasa nada");
        }

    }
}
