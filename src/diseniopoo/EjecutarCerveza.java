package diseniopoo;

import java.util.Scanner;

public class EjecutarCerveza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la Cerveza:");
        String nombre = sc.nextLine();
        System.out.println("Tipo de cerveza:");
        String tipo = sc.nextLine();
        System.out.println("Ingrese el costo:");
        double precio =  sc.nextDouble();
        System.out.println("Numero de unidades vendidas:");
        int unidades = sc.nextInt();
        Cerveza cerveza = new Cerveza(precio, unidades, nombre, tipo);
        cerveza.presentacion();
    }
}
