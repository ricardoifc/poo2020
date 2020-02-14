package taller_repeticion;

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Cuantos numeros dese ingresar");
        int n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese un numero");
            numero = entrada.nextInt();
            Factorial factorial = new Factorial(numero);
            factorial.calcular_factorial(numero);
            System.out.println(factorial.getFactorial());
        }
    }
}
