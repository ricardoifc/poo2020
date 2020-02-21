package matrizpoo;

import java.util.Scanner;

public class EjecutarTranspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Declaracion de variables
         */
        int iTam;
        int jTam;
        int matriz[][];
        /**
         * Ingreso de fila y columna
         */
        System.out.println("Ingrese fila");
        iTam = sc.nextInt();
        System.out.println("Ingrese Columna");
        jTam = sc.nextInt();
        matriz = new int [iTam][jTam];
        System.out.println("Ingrese la Matriz");
        /**
         * Obtencion de valores de la matriz por teclado
         */
        for(int i = 0; i<= (iTam-1); i++){
            for(int j = 0; j <= (jTam-1); j++){
                System.out.printf("Fila %s, Columna %s:\n", i+1,j+1);
                matriz[i][j]= sc.nextInt();
            }
        }
        /**
         * Creacion de objeto y llamada a metodos
         */
        Transpuesta transpuesta = new Transpuesta(iTam, jTam, matriz);
        transpuesta.calcularTraspuesta();
        /**
         * Mostrar los metodos
         */
        System.out.println("Matriz");
        transpuesta.presentarMatriz();
        System.out.println("Transpuesta");
        transpuesta.presentarTranspuesta();
    }
}
