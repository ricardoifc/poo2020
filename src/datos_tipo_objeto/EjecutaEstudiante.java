package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaracion de variables
        int cont;
        Estudiante [] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        Scanner sc = new Scanner(System.in);
        for(cont = 0; cont <= (estudiantes.length-1); cont++){
            System.out.println("INGRESO DE NUEVO ESTUDIANTE");
            Estudiante est = new Estudiante();
            System.out.println("Ingrese Nombre");
            est.setNombre (sc.nextLine ());
            System.out.println ("Ingrese Cedula");
            est.setCedula (sc.nextLine ());
            System.out.println ("Ingrese Edad");
            est.setEdad (sc.nextInt ());
            sc.nextLine ();
            System.out.println ("Ingrese Carrera");
            est.setCarrera (sc.nextLine ());
            System.out.println ("Ingrese Correo");
            est.setCorreo (sc.nextLine ());
            // Asignamos el objeto est a la variable estudiante estudiante = est
            estudiantes[cont] = est;
        }
        System.out.println ("LISTA DE ESTUIDANTES");
        System.out.println ("Cedula\nNombre");

        for (cont = 0; cont <= (estudiantes.length - 1); cont++) {
            System.out.println (estudiantes[cont].getCedula() + "\t" + estudiantes[cont].getNombre());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
