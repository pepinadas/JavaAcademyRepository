package org.accenture.cave;

import java.util.ArrayList;
import java.util.List;

public class SingletonCave {

    // El objeto Singleton
    private static SingletonCave conDb;

    //Una lista de los supervivientes en la cueva se guardara aqui
    static private List<String> survivors;

    //La vida requerida para estar en la cueva se asignara aqui
    private int liveRequired;

    // El numero total de visitantes que ha obtenido la cueva se guardaran aqui
    private static int visitors;

    // El constructor de el Singleton
    private SingletonCave(int liveRequired) {
        this.liveRequired = liveRequired;
        this.survivors = new ArrayList<>();

    }

    // Metodo getInstance
    static public SingletonCave getInstance(int liveRequired) {
        if(conDb == null) {
            // Asigna la vida necesaria y retorna una instancia.
            conDb = new SingletonCave(liveRequired);
            return conDb;
        } else {
            return conDb;
        }
    }

    // Este metodo nos permite agregar un visitante.
    private static void addVisitors() {
        visitors++;
    }

    // Este metodo nos permite saber si el visitante que pasamos ha sobrevivido o no.
    public static boolean doISurvive(String lastVisitor, int live) {
        addVisitors();
        if (live > conDb.liveRequired) {
            System.out.println(lastVisitor + " has survived" + " with " + (live - conDb.liveRequired) + " of life left");
            survivors.add(lastVisitor);
            return false;
        } else if (live == conDb.liveRequired) {
            System.out.println(lastVisitor + " has survived with 0 life left, YOU WIN!!");
            survivors.add(lastVisitor);
            getSurvivors();
            return true;
        } else {
            System.out.println(lastVisitor + " has " + live +" and died ");
            return false;
        }
    }

    // Nos permite obtener el numero total de visitantes.
    static int getNumberVisitors() {
        return visitors;
    }

    // Nos permite obtener el nombre de los supervivientes.
    static List<String> getSurvivors() {
        return survivors;
    }


}
