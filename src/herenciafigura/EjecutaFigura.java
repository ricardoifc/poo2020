package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        String nombre;
        int opcion;
        double base, altura, lado, radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija que tipo de figura es\n1. Rectangulo\n2. Cuadrado\n3. Triangulo\n4. Circulo");
        opcion = sc.nextInt();
        System.out.println("Escriba un nombre oara su figura");
        nombre = sc.nextLine();
        switch (opcion){
            case 1:
                AreaRectan areaRectan = new AreaRectan();
                areaRectan.setNombre(nombre);
                System.out.println("Escriba la altura");
                altura = sc.nextDouble();
                areaRectan.setAltura(altura);
                System.out.println("Escriba la base");
                base = sc.nextDouble();
                areaRectan.setBase(base);
                areaRectan.calcularArea();
                System.out.println("Nombre: " + areaRectan.getNombre());
                System.out.println("El area es: " + areaRectan.getArea());
                break;
            case 2:
                AreaCuadrado areaCuadrado = new AreaCuadrado();
                areaCuadrado.setNombre(nombre);
                System.out.println("Escriba el lado");
                lado = sc.nextDouble();
                areaCuadrado.setLado(lado);
                areaCuadrado.calcularArea();
                System.out.println("Nombre: " + areaCuadrado.getNombre());
                System.out.println("El area es: " + areaCuadrado.getArea());
                break;
            case 3:
                AreaTriangulo areaTriangulo = new AreaTriangulo();
                areaTriangulo.setNombre(nombre);
                System.out.println("Escriba la altura");
                altura = sc.nextDouble();
                areaTriangulo.setAltura(altura);
                System.out.println("Escriba la base");
                base = sc.nextDouble();
                areaTriangulo.setBase(base);
                areaTriangulo.calcularArea();
                System.out.println("Nombre: " + areaTriangulo.getNombre());
                System.out.println("El area es: " + areaTriangulo.getArea());
                break;
            case 4:
                AreaCirculo areaCirculo = new AreaCirculo();
                System.out.println("Ingrese el radio");
                radio = sc.nextDouble();
                areaCirculo.setNombre(nombre);
                areaCirculo.setRadio(radio);
                areaCirculo.calcularArea();
                System.out.println("Nombre: " + areaCirculo.getNombre());
                System.out.println("El area es: " + areaCirculo.getArea());
                break;
        }
    }
}
