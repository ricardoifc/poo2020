package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<Estudiante> ();
        int opcion;
        boolean bandera = true;
        System.out.println ("SISTEMA DE INGRESO DE VEHICULOS");
        do {
            System.out.println ("----------------------------\n1. Agregar nuevo vehiculo\n2.Presentar vehiculoS" +
                    "\n3.Salir\nElija una opcion\n----------------------------");
            opcion = sc.nextInt();
            sc.nextLine ();
            switch (opcion){
                case 1:
                    Estudiante estudiante = new Estudiante ();
                    System.out.println ("Ingresa Nombre\n----------------------------");
                    estudiante.setNombre (sc.nextLine ());
                    System.out.println ("Ingresa Correo\n----------------------------");
                    estudiante.setCorreo (sc.nextLine ());
                    System.out.println ("Ingresa la Carrera\n----------------------------");
                    estudiante.setCarrera (sc.nextLine ());
                    System.out.println ("Ingresa la Edad\n----------------------------");
                    estudiante.setEdad (sc.nextInt ());
                    sc.nextLine ();
                    System.out.println ("Ingresa la Cedula\n----------------------------");
                    estudiante.setCedula (sc.nextLine ());
                    estudiantes.add (estudiante);
                    break;
                case 2:

                    System.out.println ("FICHA DE ESTUDIANTES");
                    for(Estudiante v: estudiantes){
                        System.out.println ("---------------------");
                        System.out.println ("NOMBRE: " + v.getNombre ());
                        System.out.println ("CORREO: " + v.getCorreo ());
                        System.out.println ("CARRERA: " + v.getCarrera ());
                        System.out.println ("Edad: " + v.getEdad ());
                        System.out.println ("Cedula :" + v.getCedula ());
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
