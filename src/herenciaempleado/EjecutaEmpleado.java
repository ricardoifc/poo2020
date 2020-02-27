package herenciaempleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, cargo, dependencia;
        int opcion = 1;
        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese cargo");
        cargo = sc.nextLine();
        System.out.println("Ingrese dependencia");
        dependencia = sc.nextLine();
        System.out.println("1. Para Empleado por hora, 2. Para Empleado Asalariado");
        if(opcion == 1){
            System.out.println("Ingrese Horas");
            int hora = sc.nextInt();
            double valorHora = sc.nextDouble();
            System.out.println("Ingrese Valor Hora");
            hora = sc.nextInt();
            System.out.println("");
            EmpleadoPorHora empleado = new EmpleadoPorHora();
            empleado.setHora(hora);
            empleado.setValorHora(valorHora);
        }else{

            EmpleadoAsalariado empleado = new EmpleadoAsalariado();
        }


    }
}
