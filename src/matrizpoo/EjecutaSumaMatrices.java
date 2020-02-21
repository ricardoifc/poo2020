package matrizpoo;

import java.util.Scanner;

public class EjecutaSumaMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        int matrizC[][] = new int [3][3];
        System.out.println("Ingrese la Matriz A");
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                System.out.printf("Fila %s, Columna %s:\n", i+1,j+1);
                matrizA[i][j]= sc.nextInt();
            }
        }
        System.out.println("Ingrese la Matriz B");
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                System.out.printf("Fila %s, Columna %s:\n", i+1,j+1);
                matrizB[i][j]= sc.nextInt();
            }
        }
        SumaMatrices sumaMatrices = new SumaMatrices(matrizA, matrizB);
        matrizC = sumaMatrices.calcularSuma();
        System.out.println("Matriz A");
        sumaMatrices.presentar(matrizA);
        System.out.println("Matriz A");
        sumaMatrices.presentar(matrizB);
        System.out.println("Matriz C");
        sumaMatrices.presentar(matrizC);


    }
}
