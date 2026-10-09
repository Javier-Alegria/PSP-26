package Ejemplos.CrearProcesosRuntime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ejemplo1args {
    static void main(String [] args) {
        try {
            Runtime run =  Runtime.getRuntime();

            if (args != null) {
                Process p = run.exec(args);
                p.waitFor(5, TimeUnit.SECONDS);
                p.destroy();
            }
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
}
