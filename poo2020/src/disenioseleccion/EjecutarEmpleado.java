package disenioseleccion;

import java.util.Scanner;

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de el Empleado:");
        String nombre = sc.nextLine();
        System.out.println("Horas trabajadas:");
        int horas = sc.nextInt();
        double cuotas = 1;
        double sueldo = 0;
        Empleado empleado = new Empleado(nombre, horas, cuotas, sueldo);
        empleado.obtenerNombre();
        empleado.obtenerSueldo();
    }
}
