package Ejemplos.CrearProcesoProcessBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploRedirectFile {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("cmd","/c","dir");
        pb.redirectOutput(ProcessBuilder.Redirect.PIPE);

        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            System.out.println(p.info());
        } catch (IOException e) {
            System.err.println("Error al lanzar el proceso");
        }
    }
}
