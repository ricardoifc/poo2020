package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutarCedula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Declaracion de variables
         */
        String cedulaStr = "";
        String separar[] = new String[10];
        int cedula[] = new int[10];
        int tam;
        boolean bandera = true;
        /**
         * Comprobacion si es de 10 numeros
         */
        while(bandera == true) {
            System.out.println("Ingrese su cedula");
            cedulaStr = sc.nextLine();
            tam = cedulaStr.length();
            if (tam == 10) {
                bandera = false;
            }
        }
        /**
         * Separacion de numeros de cedula y conversion a entero
         */
        separar= cedulaStr.split("");
        for (int i = 0; i <= 9; i++){
            cedula[i] = Integer.parseInt(separar[i]);
        }
        /**
         * Creacion de objeoto y llamadas a los metodos
         */
        Cedula cedula1 = new Cedula(cedula);
        cedula1.calcularCedula();
        cedula1.comprobarCedula();
        cedula1.presentar();

    }
}
