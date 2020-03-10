package proyectopoo;

import datos_tipo_objeto.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjecutarMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        int opcion;
        boolean bandera = true;
        System.out.println ("Market ");
        do {
            System.out.println ("----------------------------\n1. Agregar nuevo producto\n2.Presentar vehiculoS" +
                    "\n3.Salir\nElija una opcion\n----------------------------");
            opcion = sc.nextInt();
            sc.nextLine ();
            switch (opcion){
                case 1:
                    Estudiante estudiante = new Estudiante ();
                    System.out.println ("Ingresa Nombre\n----------------------------");
                    estudiante.setNombre (sc.nextLine ());
                    estudiantes.add (estudiante);
                    break;
                case 2:

                    System.out.println ("FICHA DE ESTUDIANTES");
                    for(Estudiante v: estudiantes){
                        System.out.println ("---------------------");
                        System.out.println ("NOMBRE: " + v.getNombre ());

                        System.out.println ("---------------------");
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println ("Opcion incorrecta");
            }
        }while (bandera);
    }
}
