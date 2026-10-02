package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;

public class EjemploDirectoryCommand {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.directory(new File("C:\\ficheros"));
        pb.command("notepad.exe","fichero1.txt");

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
