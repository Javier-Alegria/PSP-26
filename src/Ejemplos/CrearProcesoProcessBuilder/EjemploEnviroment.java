package Ejemplos.CrearProcesoProcessBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class EjemploEnviroment {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Map<String, String> lista = pb.environment();

        System.out.println(lista.toString());
        System.out.println(lista.get("PROCESSOR_LEVEL"));
        System.out.println(lista.get("NUMBER_OF_PROCESSORS"));

        Process p = null;

        try {
            p = pb.start();
            int retorno = p.waitFor();
            if (retorno == 0) {
                System.out.println("Todo correcto");
            } else
                System.out.println("No ha ido bien");

            p = pb.start();
            System.out.println(p.info());
            System.out.println("HOLA");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
