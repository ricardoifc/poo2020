package deber_seleccion;

import java.util.Scanner;

public class EjecutarMayorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ïngrese 4 numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int numero4 = sc.nextInt();
        MayorNumero mayorNumero = new MayorNumero(numero1, numero2, numero3, numero4);
        mayorNumero.obtenerNumMayor();
    }
}
