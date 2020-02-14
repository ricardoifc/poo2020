package disenio_repeticion;

import java.util.Scanner;

public class EjecutarSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int horas;
        double cuota;
        boolean opcion = true;
        String seleccion;
        System.out.println("Ingrese el valor de la cuota");
        cuota = sc.nextDouble();
        sc.nextLine();
        do{
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
                System.out.println("Gracias");
                opcion = false;
            }
        }while(opcion==true);
    }
}
