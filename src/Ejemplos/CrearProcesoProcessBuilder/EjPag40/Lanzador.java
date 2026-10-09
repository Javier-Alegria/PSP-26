package Ejemplos.CrearProcesoProcessBuilder.EjPag40;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lanzador {

    public static int lanzarSumador(String num1, String num2, String ficheroSalida,
                                    String ficheroError) {

        ProcessBuilder pb;
        pb= new ProcessBuilder();
        int retorno;
        Process p;
        String classPath="C:\\Users\\Usuario\\Desktop\\2DAM\\Acceso a Datos - AADD26\\Proyectos\\PSP-26\\src";

        pb.command("java.exe", "-cp", classPath, "Ejemplos.CrearProcesoProcessBuilder.EjPag40.Sumador", num1, num2);

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
        String numero1, numero2, fichSalida, fichError;
        String usuarioContinuar;
        Scanner sc = new Scanner(System.in);
        int retorno;
        boolean continuar = true;

        while(continuar) {
            System.out.println("Ingrese el número 1: ");
            numero1 = sc.nextLine();
            System.out.println("Ingrese el núemro 2: ");
            numero2 = sc.nextLine();
            System.out.println("Ingrese el fichero de salida: ");
            fichSalida = sc.nextLine();
            System.out.println("Ingrese el fichero de error: ");
            fichError = sc.nextLine();

            retorno = lanzarSumador(numero1, numero2, fichSalida,fichError);
            if (retorno==0)
                System.out.println("Ha ido bien la ejecución, salida en: " + fichSalida);
            else System.out.println("Ha ido mal, error en: " + fichError);

            do {
                System.out.println("Quieres continuar? s/n");
                usuarioContinuar = sc.nextLine().toLowerCase();

                if(usuarioContinuar.equals("n")) {
                    System.out.println("Saliendo...");
                    continuar = false;
                } else if (usuarioContinuar.equals("s")) {
                    System.out.println("Continuando...");
                } else {
                    System.err.println("Entrada incorrecta");
                }
            } while(!usuarioContinuar.equals("s") && !usuarioContinuar.equals("n"));

        }

        System.out.println("Fin de mi programa");
    }
}
