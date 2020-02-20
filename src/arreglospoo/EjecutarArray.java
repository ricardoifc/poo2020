package arreglospoo;

import java.util.Scanner;

public class EjecutarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vectorA = new int[10];
        int [] vectorB = new int[10];
        System.out.println(vectorA.length);

        for(int i=  0; i < vectorA.length; i++){
            System.out.println("Ingrese valor vector A #"+ i);
            vectorA[i] = sc.nextInt();
        }
        for(int i = 0; i < vectorB.length; i++){
            System.out.println("Ingrese valor vector A #"+ i);
            vectorB[i] = sc.nextInt();
        }
        Array array = new Array(vectorA, vectorB);
        array.calcularSumatoria();
        array.presentar();
    }

}
