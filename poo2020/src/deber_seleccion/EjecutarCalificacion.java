package deber_seleccion;

import java.util.Scanner;

public class EjecutarCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Escriba la calificacion 1");
        double calificacion1 = sc.nextDouble();
        System.out.println("Escriba la calificacion 2");
        double calificacion2 = sc.nextDouble();
        System.out.println("Escriba la calificacion 3");
        double calificacion3 = sc.nextDouble();
        System.out.println("Escriba la calificacion 4");
        double calificacion4 = sc.nextDouble();
        Calificacion calificacion = new Calificacion(nombre, calificacion1,calificacion2,calificacion3,calificacion4);
        calificacion.obtenerNombre();
        calificacion.obtenerPromedio();
        calificacion.obtenerComentario();
    }
}
