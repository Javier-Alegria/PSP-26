package Ejemplos.EjemploRuntime;

import java.io.IOException;

public class Ejemplo1conArgs {

    static void main(String[] args) {
        try {
            Runtime run = Runtime.getRuntime();
            if(args!=null){
                run.exec(args);
            }
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
