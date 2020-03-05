package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaVolumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int opcionF, opcion;
        boolean band = true;

        do {
            System.out.println("Eliga la figura \n1. CUBO\n2. CILINDRO\n3. CONO\n4. ESFERA");
            opcionF = sc.nextInt();
            switch (opcionF){
                case 1:
                    nombre = "CUBO";
                    System.out.println("Ingrese el valor de las aristas del cubo:");
                    double aristas = sc.nextDouble();
                    Cubo cubo = new Cubo(aristas, nombre);
                    cubo.calcularVolumen();
                    System.out.printf("EL VOLUMEN DEL %s es %.2f\n", cubo.getNombreF(), cubo.getVolumen());
                    break;
                case 2:
                    nombre = "CILINDRO";
                    System.out.println("Ingrese el valor del radio del cilindro");
                    double radioCil = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cilindro");
                    double alturaCil = sc.nextDouble();
                    Cilindro cil = new Cilindro(radioCil, alturaCil, nombre);
                    cil.calcularVolumen();
                    System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cil.getNombreF(), cil.getVolumen());
                    break;
                case 3:
                    nombre = "CONO";
                    System.out.println("Ingrese el valor del radio del cono");
                    double radioCono = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cono");
                    double alturaCono = sc.nextDouble();
                    Cono cono = new Cono(radioCono, alturaCono, nombre);
                    cono.calcularVolumen();
                    System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cono.getNombreF(), cono.getVolumen());
                    break;
                case 4:
                    nombre = "ESFERA";
                    System.out.println("Ingrese el radio de la esfera");
                    double radioEsf = sc.nextDouble();
                    Esfera esfera = new Esfera(radioEsf,nombre);
                    esfera.calcularVolumen();
                    System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", esfera.getNombreF(), esfera.getVolumen());
                    break;
            }
            System.out.printf("Desea calcular otra figura\n1. Si\n2. No\n");
            opcion = sc.nextInt();
            if (opcion == 2){
                band = false;
            }
        }while (band);
    }
}
