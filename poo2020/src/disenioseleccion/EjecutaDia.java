package disenioseleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        Dia dia = new Dia();
        dia.establecerNum(num);
        System.out.println(dia.obtenerNombre());
    }
}
