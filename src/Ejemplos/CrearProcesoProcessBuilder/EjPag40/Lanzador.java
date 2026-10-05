package Ejemplos.CrearProcesoProcessBuilder.EjPag40;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lanzador {

    public static int lanzarSumador(String num1, String num2, String ficheroSalida,
                                    String ficheroError) {

        ProcessBuilder pb;
        pb= new ProcessBuilder();
        int retorno;
        Process p;
        String classPath="C:\\Users\\Usuario\\Desktop\\2DAM\\Acceso a Datos - AADD26\\Proyectos\\PSP-26\\src\\Ejemplos";

        pb.command("java.exe", "-cp", classPath, "CrearProcesoProcessBuilder.EjPag40.Sumador", num1, num2);

        try {
            FileWriter fw= new FileWriter(ficheroSalida, true);

            pb.redirectError(new File(ficheroError));
            pb.redirectOutput(new File(ficheroSalida));

            p= pb.start();
            retorno= p.waitFor();
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            retorno=-1;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            retorno=-1;
        }
        return retorno;
    }

    public static void main(String[] args) {
        int retorno;
        retorno= lanzarSumador("1", "5", "salida1.txt","error1.txt");

        if (retorno==0)
            System.out.println("Ha ido bien la ejecución");
        else System.out.println("Ha ido mal");

        retorno= lanzarSumador("1", "2", "salida2.txt","error2.txt");
        if (retorno==0)
            System.out.println("Ha ido bien la ejecución");
        else System.out.println("Ha ido mal");

        retorno= lanzarSumador("2", "1", "salida3.txt","error3.txt");
        if (retorno==0)
            System.out.println("Ha ido bien la ejecución");
        else System.out.println("Ha ido mal");
        System.out.println("Fin de mi programa");

    }

}
