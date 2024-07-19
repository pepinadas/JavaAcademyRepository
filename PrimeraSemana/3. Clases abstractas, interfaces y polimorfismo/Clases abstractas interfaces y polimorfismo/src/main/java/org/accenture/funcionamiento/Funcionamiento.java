package org.accenture.funcionamiento;

public abstract class Funcionamiento {

    int y = 1;

    boolean jugar (int x) {
        boolean result = false;
        switch (x) {
            case 1:
                if ( y == 1 ) {
                    System.out.println("Empate");
                }
                if (y == 2 ) {
                    System.out.println("Perdi");
                }
                else {
                    System.out.println("Gane");
                    result = true;
                }
                break;
            case 2:
                if ( y == 1 ) {
                    System.out.println("Gane");
                    result = true;
                }
                if (y == 2 ) {
                    System.out.println("Empate");
                }
                else {
                    System.out.println("Perdi");
                }
                break;
            case 3:
                if ( y == 1 ) {
                    System.out.println("Perdi");
                }
                if (y == 2 ) {
                    System.out.println("Gane");
                    result = true;
                }
                else {
                    System.out.println("Empate");
                }
                break;
        }
        return result;
    }
}
