package org.example.classes;

public class ContadorSingleton {
    private static ContadorSingleton contadorSingleton;
    private int contador = 0;
    private ContadorSingleton(){}

    public static ContadorSingleton getInstance(){
        if(contadorSingleton == null){
            contadorSingleton = new ContadorSingleton();
        }
        return contadorSingleton;
    }

    public int modifyContador(int number){
        contador += number;
        return contador;
    }

    public int getContador() {
        return contador;
    }
}
