package polimorfismo_poo;

import herenciaempleado.EmpleadoAsalariado;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        // Obtener el sueldo quincenal de un empleado por horas
        EmpleadoPorHora2 empHoras = new EmpleadoPorHora2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcula sueldo quincenal empleado por Hora");
        System.out.println("Ingrese horas trabajadas: ");
        empHoras.setHoras_trabajadas(sc.nextDouble());
        System.out.println("Ingrese la cuota por hora");
        empHoras.setCuota_por_hora(sc.nextDouble());
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empHoras.getSueldo());

        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de empleado asalariado");
        System.out.println("Ingrese sueldo mensual");
        empAs.setSueldo_mensual((sc.nextDouble()));
        empAs.calcularSueldoQna();
        System.out.println("Sueldo quincenal es: " + empAs.getSueldo());
    }
}
