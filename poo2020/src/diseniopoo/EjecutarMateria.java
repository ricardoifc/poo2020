package diseniopoo;

import java.util.Scanner;


public class EjecutarMateria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Universidad Tecnica Particular de Loja");
        System.out.println("Nombre de el estudiante:");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Nombre de la materia:");
        String nombreMateria = sc.nextLine();
        System.out.println("Nota de el Primer Bimestre");
        Double bimestre1 = sc.nextDouble();
        System.out.println("Nota de el Segundo Bimestre");
        Double bimestre2 = sc.nextDouble();
        Materia materia = new Materia(nombreEstudiante, nombreMateria, bimestre1, bimestre2);
        materia.presentacion();
    }
}
