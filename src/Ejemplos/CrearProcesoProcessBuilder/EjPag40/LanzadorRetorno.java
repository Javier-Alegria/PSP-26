package Ejemplos.CrearProcesoProcessBuilder.EjPag40;

import java.io.File;
import java.io.IOException;

public class LanzadorRetorno {

    public static void lanzarSumador(String num1, String num2, String ficheroSalida,
                                     String ficheroError) {

        ProcessBuilder pb;

        pb= new ProcessBuilder();
        String classPath="C:\\Users\\Usuario\\Desktop\\2DAM\\Acceso a Datos - AADD26\\Proyectos\\PSP-26\\src\\Ejemplos";

        pb.command("java.exe", "-cp", classPath, "CrearProcesoProcessBuilder.EjPag40.Sumador", num1, num2);
        pb.redirectError(new File(ficheroError));
        pb.redirectOutput(new File(ficheroSalida));

        try {
            pb.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        lanzarSumador("1", "5", "salida1.txt","error1.txt");
        lanzarSumador("1", "2", "salida2.txt","error2.txt");
        lanzarSumador("2", "1", "salida3.txt","error3.txt");
        System.out.println("Fin de mi programa");

    }

}
