package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;

public class EjemploDirectory {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe","fichero1.txt");
        pb.directory(new File("C:\\ficheros"));

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
