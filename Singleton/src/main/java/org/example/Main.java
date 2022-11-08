package org.example;

import org.example.classes.ContadorSingleton;

public class Main {
    public static void main(String[] args) {
        int aux = 0;
        ContadorSingleton contador = ContadorSingleton.getInstance();
        contador.modifyContador(5);


        ContadorSingleton contador2 = ContadorSingleton.getInstance();
        contador2.modifyContador(5);
        System.out.println("Aux1: " +  contador.getContador() + " contador: " + contador
                                    + ", Aux2: " + contador2.getContador() + ", contador2: " + contador2);
    }
}