package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutarFicha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        String universidad = "";
        String cedula = "";
        int contador = 1;
        do{
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();
            System.out.println("Ingrese la edad");
            sc.nextInt();
            edad = sc.nextInt(edad);
            System.out.println("Ingrese las iniciales de la universidad");
            universidad = sc.nextLine();
            System.out.println("ingrese la cedula");
            cedula = sc.nextLine();

            Ficha ficha = new Ficha(nombre, edad, universidad, cedula);

            contador = contador + 1;
        }while(contador <= 5);
    }
}
