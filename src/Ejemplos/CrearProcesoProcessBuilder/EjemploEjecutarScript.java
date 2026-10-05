package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;

public class EjemploEjecutarScript {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("cmd");
        pb.directory(new File("C:\\ficheros"));

        pb.redirectOutput(new File("C:\\ficheros\\salida.txt"));
        pb.redirectError(new File("C:\\ficheros\\error.txt"));
        pb.redirectInput(new File("C:\\ficheros\\entrada.txt"));

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
