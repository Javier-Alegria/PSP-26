package Ejemplos.CrearProcesoProcessBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo1conList {
    static void main() {
        List<String> lista = new ArrayList<String>();
        lista.add("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        lista.add("https://www.google.es");
        ProcessBuilder pb = new ProcessBuilder(lista);

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
