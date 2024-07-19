package org.accenture.v2;

import java.util.ArrayList;
import java.util.List;

public class SingletonCave {

    private static SingletonCave conDb;

    static private List<String> survivors;
    private int liveRequired;
    private static int visitors;

    private SingletonCave(int liveRequired) {
        this.liveRequired = liveRequired;
        this.survivors = new ArrayList<>();
        visitors ++;
    }

    static public SingletonCave getInstance(int liveRequired) {
        if(conDb == null) {
            conDb = new SingletonCave(liveRequired);
            return conDb;
        } else {
            return conDb;
        }
    }

    static void doISurvive(String lastVisitor, int live) {
        if (live > conDb.liveRequired) {
            System.out.println(lastVisitor + " has survived");
            survivors.add(lastVisitor);
        } else {
            System.out.println(lastVisitor + " has died");
        }
    }

    static int getNumberVisitors() {
        return visitors;
    }

    static List<String> getSurvivors() {
        return survivors;
    }


}
