package Ejemplos.CrearProcesoProcessBuilder;

import java.io.IOException;

public class Ejemplo1 {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");

        try {
            pb.start();
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
