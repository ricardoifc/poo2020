package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutarFicha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Declaracion de variables
         */
        String nombre = "";
        String edad = "";
        String universidad = "";
        String celular = "";
        int contador;
        /**
         * creacion de objeto Ficha
         */
        Ficha ficha = new Ficha();
        /**
         * Obtencion de datos mediante un ciclo repetitivo
         */
        for(contador = 0; contador <= 4; contador++){
            System.out.println("Ingrese al estudiante " + contador);
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();
            System.out.println("Ingrese la edad");
            edad = sc.nextLine();
            System.out.println("Ingrese las iniciales de la universidad");
            universidad = sc.nextLine();
            System.out.println("ingrese la cedula");
            celular = sc.nextLine();
            /**
             * Envio de datos al objeto
             */
            ficha.obtenerDatos(nombre, edad, universidad, celular);
            ficha.almacenarArreglo(contador);
        }
        /**
         * Presentacion de el objeto
         */

        ficha.presentar();
    }
}
