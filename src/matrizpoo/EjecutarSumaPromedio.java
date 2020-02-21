package matrizpoo;

import java.util.Scanner;

public class EjecutarSumaPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Declaracion de variables
         */
        int iTam;
        int jTam;
        float suma;
        float promedio;
        /**
         * Ingreso de fila y columna
         */
        System.out.println("Ingrese fila");
        iTam = sc.nextInt();
        System.out.println("Ingrese Columna");
        jTam = sc.nextInt();
        int matriz[][] = new int [iTam][jTam];
        System.out.println("Ingrese la Matriz");
        /**
         * Obtencion de valores de la matriz
         */
        for(int i = 0; i<= (iTam-1); i++){
            for(int j = 0; j <= (jTam-1); j++){
                System.out.printf("Fila %s, Columna %s:\n", i+1,j+1);
                matriz[i][j]= sc.nextInt();
            }
        }
        /**
         * Creacion de objeto y llamada a los metodos
         */
        SumaPromedio sumaPromedio = new SumaPromedio(iTam, jTam, matriz);
        suma =sumaPromedio.calcularSuma();
        promedio =sumaPromedio.calcularPromedio();
        /**
         * Presentacion de el resultado
         */
        System.out.println("La matriz es: ");
        sumaPromedio.presentarMatriz();
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + promedio);
    }
}
