package deber_seleccion;

import disenioseleccion.Empleado;

import java.util.Scanner;

public class EjecutarSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de el Empleado:");
        String nombre = sc.nextLine();
        System.out.println("Horas trabajadas:");
        int horas = sc.nextInt();
        double cuotas = 2;
        Sueldo sueldo = new Sueldo(nombre, horas, cuotas);
        sueldo.obtenerNombre();
        sueldo.obtenerSueldo();
    }
}
