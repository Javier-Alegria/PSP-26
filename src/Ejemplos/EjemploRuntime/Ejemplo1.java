package Ejemplos.EjemploRuntime;

import java.io.IOException;

public class Ejemplo1 {
    static void main() {
        Runtime run = Runtime.getRuntime();
        System.out.println("Free memory: " + run.freeMemory());
        System.out.println("Max memory: " + run.maxMemory());
        try {
            String[] parametros = new String[2];
            parametros[0] = "Notepad.exe";
            parametros[1] = "hola.txt";
            run.exec(parametros);
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
