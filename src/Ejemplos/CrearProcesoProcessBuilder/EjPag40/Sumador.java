package Ejemplos.CrearProcesoProcessBuilder.EjPag40;

public class Sumador {

    public static int suma(int num1, int num2) {

        int resultado=0;
        int min, max;
        min =num1;
        max=num2;

        if (num1>num2)
        {
            min =num2;
            max=num1;
        }

        for (int i=min; i<=max;i++)
            resultado+=i;

        return resultado;
    }

    public static void main(String[] args) {
        int resultado=0;
        if (args.length==2)
            resultado =suma(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.println("El resultado es "+ resultado);

    }

}
