package Ejemplos.CrearProcesoProcessBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploRedirectINHERIT {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("cmd","/c","dir");
        //pb.command("cmd","/c","dir");

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);

        try {
            Process p = pb.start();
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
