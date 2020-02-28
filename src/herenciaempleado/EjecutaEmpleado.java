package herenciaempleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // salario mensual
        String nombre, cargo, dependencia;
        int opcion = 1;
        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese cargo");
        cargo = sc.nextLine();
        System.out.println("Ingrese dependencia");
        dependencia = sc.nextLine();
        System.out.println("1. Para Empleado por hora, 2. Para Empleado Asalariado");
        opcion = sc.nextInt();

        // Si es uno es sueldo por hora y si es dos es salario mensual
        if(opcion == 1){
            System.out.println("Ingrese Horas");
            int hora = sc.nextInt();
            System.out.println("Ingrese Valor Hora");
            double valorHora = sc.nextDouble();
            EmpleadoPorHora empleado = new EmpleadoPorHora();
            empleado.setHora(hora);
            empleado.setValorHora(valorHora);
            empleado.setNombre(nombre);
            empleado.setCargo(cargo);
            empleado.setDependencia(dependencia);
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("Depenmdencia: " + empleado.getDependencia());
            System.out.println("El sueldo es: "+ empleado.calcularSueldoPorHora());
        }else{
            System.out.println("Ingrese el valor del salario");
            double  valorMensual = sc.nextDouble();
            EmpleadoAsalariado empleado = new EmpleadoAsalariado();
            empleado.setValor_mensual(valorMensual);
            empleado.setNombre(nombre);
            empleado.setCargo(cargo);
            empleado.setDependencia(dependencia);
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("Depenmdencia: " + empleado.getDependencia());
            System.out.println("El sueldo es: "+ empleado.calcularSueldoMensual());

        }


    }
}
