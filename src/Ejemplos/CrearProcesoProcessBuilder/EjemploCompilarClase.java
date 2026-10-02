package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;

public class EjemploCompilarClase {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("javac.exe", "prueba2/Hola.java"); // Llamamos al proceso javac (compilador) con el fichero a compilar
        pb.directory(new File("C:\\ficheros")); // Cambiamos el directorio de trabajo a C:/ficheros

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
