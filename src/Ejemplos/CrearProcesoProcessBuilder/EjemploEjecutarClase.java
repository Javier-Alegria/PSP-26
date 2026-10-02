package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;

public class EjemploEjecutarClase {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("java.exe", "prueba2.Hola"); // Llamamos al proceso java con el fichero que queremos ver
        pb.directory(new File("C:\\ficheros")); // Cambiamos el directorio de trabajo a C:/ficheros
        pb.redirectOutput(new File("C:\\ficheros\\salida.txt"));
        pb.redirectError(new File("C:\\ficheros\\error.txt"));

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
