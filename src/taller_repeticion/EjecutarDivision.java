package taller_repeticion;

import java.util.Scanner;

public class EjecutarDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        double dividendo = sc.nextDouble();
        System.out.println("Ingrese el divisor");
        double divisor = sc.nextDouble();
        Division division = new Division(dividendo, divisor);
        division.calcularSolucion();
        division.obtenerCociente();

    }
}
