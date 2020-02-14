package disenio_repeticion;

import java.util.Scanner;

public class EjecutarSueldoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int horas;
        String seleccion;
        System.out.println("Ingrese el valor de la cuota");
        double cuota = sc.nextDouble();
        System.out.println("Cuantos empleados va a ingresar");
        int empleados = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < empleados; i++){
            System.out.println("Nombre de el Empleado:");
            nombre = sc.nextLine();
            System.out.println("Horas trabajadas:");
            horas = sc.nextInt();
            Sueldo sueldo = new Sueldo(nombre, horas, cuota);
            sueldo.calcularSueldo();
            sueldo.obtenerNombre();
            sueldo.obtenerSueldo();
            System.out.println("Desea ingresar otro empleado?");
            sc.nextLine();
            seleccion = sc.nextLine();
            if(seleccion.equals("no")){
                System.out.print("Gracias");
                i = empleados;
            }
        }
    }
}
