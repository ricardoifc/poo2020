package arreglospoo;

import java.util.Scanner;

public class EjecutarSumaArreglo{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            /**
             * Declaracion de variables
             */
            int [] vectorA = new int[10];
            int [] vectorB = new int[10];
            /**
             * Obtencion de valores vector A
             */
            for(int i=  0; i < vectorA.length; i++){
                System.out.println("Ingrese valor vector A #"+ (1+i));
                vectorA[i] = sc.nextInt();
            }
            /**
             * Obtencion de valores vector B
             */
            for(int i = 0; i < vectorB.length; i++){
                System.out.println("Ingrese valor vector B #"+ (1+i));
                vectorB[i] = sc.nextInt();
            }
            /**
             * Llamada de los metodos de la clase SumaArreglo
             */
            SumaArreglo sumaArreglo = new SumaArreglo(vectorA, vectorB);
            sumaArreglo.calcularSumatoria();
            sumaArreglo.presentar();
        }
}
