package org.accenture.v2;

public class Principal {
    public static void main(String[] args) {
        SingletonCave conn1 = SingletonCave.getInstance(35);

        SingletonCave.doISurvive("Angel", 3);
        System.out.println(SingletonCave.getNumberVisitors());

//        System.out.println(conn1);
    }
}