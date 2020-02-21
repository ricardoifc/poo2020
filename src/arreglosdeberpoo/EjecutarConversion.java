package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutarConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Declaracion de variables
         */
        String numero = "";
        int tam;
        boolean bandera = true;
        /**
         * Ciclo repetitivo para ingresar solo 6 numeros
         */
        while(bandera == true) {
            System.out.println("Ingrese 6 numerpos binarios");
            numero = sc.nextLine();
            tam = numero.length();
            if(tam == 6){
                bandera = false;
            }
        }
        /**
         * Creacion y llamada al objeto
         */
        Conversion conversion = new Conversion(numero);
        conversion.calcularConversion();
        conversion.presentacion();

    }
}
