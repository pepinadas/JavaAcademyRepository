package org.accenture.cave;

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

    }

    static public SingletonCave getInstance(int liveRequired) {
        if(conDb == null) {
            conDb = new SingletonCave(liveRequired);
            return conDb;
        } else {
            return conDb;
        }
    }

    private static void addVisitors() {
        visitors++;
    }

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

    static int getNumberVisitors() {
        return visitors;
    }

    static List<String> getSurvivors() {
        return survivors;
    }


}
