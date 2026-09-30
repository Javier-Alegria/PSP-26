package Ejemplos.CrearProcesoProcessBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ejemplo1ArgumentosMain {
    static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        if (args != null){
            Collections.addAll(lista, args);
            ProcessBuilder pb = new ProcessBuilder(lista);

            try {
                Process p  = pb.start();
                System.out.println(p.info());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
