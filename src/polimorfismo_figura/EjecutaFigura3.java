package polimorfismo_figura;

import herenciafigura.AreaCirculo;
import herenciafigura.AreaCuadrado;
import herenciafigura.AreaRectan;
import herenciafigura.AreaTriangulo;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("1.Rectangulo\n2.Cuadrado\n3.Triangulo\n4.Circulo\nIngrese opcion");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
            Rectangulo3 areaRectan = new Rectangulo3();
            System.out.println("Escriba la altura");
            areaRectan.setAlturaRecta(sc.nextDouble());
            System.out.println("Escriba la base");
            areaRectan.setBaseRecta(sc.nextDouble());
            areaRectan.calcularArea();
            System.out.println("El area es: " + areaRectan.getArea());
            break;
            case 2:
            Cuadrado3 areaCuadrado = new Cuadrado3();
            System.out.println("Escriba el lado");
            areaCuadrado.setLadoCuad(sc.nextDouble());
            areaCuadrado.calcularArea();
            System.out.println("El area es: " + areaCuadrado.getArea());
            break;
            case 3:
            Triangulo3 areaTriangulo = new Triangulo3();
            System.out.println("Escriba la altura");
            areaTriangulo.establecerAlturaTria(sc.nextDouble());
            System.out.println("Escriba la base");
            areaTriangulo.establecerBaseTria(sc.nextDouble());
            areaTriangulo.calcularArea();
            System.out.println("El area es: " + areaTriangulo.getArea());
            break;
            case 4:
            Circulo3 areaCirculo = new Circulo3();
            System.out.println("Ingrese el radio");
            areaCirculo.setRadioCirc(sc.nextDouble());
            areaCirculo.calcularArea();
            System.out.println("El area es: " + areaCirculo.getArea());
            break;
        }
    }
}
