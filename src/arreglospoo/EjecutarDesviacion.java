package arreglospoo;

import java.util.Scanner;

public class EjecutarDesviacion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            /**
             * Declaracion de variable
             */
            int [] numero = new int[10];
            /**
             * obtencion de valores en numero
             */
            for(int i=  0; i < numero.length; i++){
                System.out.println("Ingrese el numero #"+ (1+i));
                numero[i] = sc.nextInt();
            }
            /**
            *Creacion de objeto y llamada a los objetos
             */
            Desviacion desviacion = new Desviacion(numero);
            desviacion.calcularMedia();
            desviacion.calcularDesviacion();
            desviacion.presentar();
        }
}
