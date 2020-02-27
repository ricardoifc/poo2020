package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutarPersonal {
    public static void main(String[] args) {
        // Creación de objeto de la clase Estudiante
        String nombre, idenficacion, estado_civil, fecha_nac, carrera;
        Scanner sc = new Scanner(System.in);
        System.out.println("CREACION DE OBJETO ESTUDIANTE, DOCENTE, ADMINISTRATIVO");
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la identificacion: ");
        idenficacion = sc.nextLine();
        System.out.println("Ingrese su carrera");
        carrera = sc.nextLine();
        System.out.println("Ingrese estado civil");
        estado_civil = sc.nextLine();
        System.out.println("Ingrese fecha nacimiento");
        fecha_nac = sc.nextLine();

        Estudiante est = new Estudiante(carrera, nombre, idenficacion, estado_civil, fecha_nac);
        System.out.println("-----------------------------");
        System.out.println("Datos de objeto estudiante");
        System.out.println("nombre: " + est.getNombre());
        System.out.println("identificacion: " + est.getIdentificacion());
        System.out.println("carrera: " + est.getCarrera());
        System.out.println("estado civil: " + est.getEstado_civil());
        System.out.println("fecha de nacimiento: " + est.getFecha_nacimiento());
        System.out.println("\n-------------------------------------------------");
        System.out.println("Ingresa el area de el docente");
        String area;
        area = sc.nextLine();
        Docente doc = new Docente(area, nombre, idenficacion, estado_civil, fecha_nac);
        System.out.println("Datos de objeto estudiante");
        System.out.println("nombre: " + doc.getNombre());
        System.out.println("identificacion: " + doc.getIdentificacion());
        System.out.println("Area: " + doc.getArea());
        System.out.println("estado civil: " + doc.getEstado_civil());
        System.out.println("fecha de nacimiento: " + doc.getFecha_nacimiento());
        System.out.println("\n-------------------------------------------------");
        System.out.println("Ingresa la dependencia");
        String dependencia;
        dependencia = sc.nextLine();
        Administrativo adm = new Administrativo(dependencia, nombre, idenficacion, estado_civil, fecha_nac);
        System.out.println("Datos de objeto estudiante");
        System.out.println("nombre: " + adm.getNombre());
        System.out.println("identificacion: " + adm.getIdentificacion());
        System.out.println("dependencia: " + adm.getDependencia());
        System.out.println("estado civil: " + adm.getEstado_civil());
        System.out.println("fecha de nacimiento: " + adm.getFecha_nacimiento());
        System.out.println("---------------------------------------------------");
    }
}
