package taller_repeticion;

import java.util.Scanner;

public class EjecutarCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposito;
        double retiro;
        boolean menu = true;
        String seleccion= "";
        int opcion;
        System.out.println("Ingrese saldo inicial de su cuenta");
        Double saldo = sc.nextDouble();
        Cajero cajero = new Cajero(saldo);
        do{
            System.out.println("-------------------------------------");
            System.out.println("|Opcion 1: Realizar deposito         |");
            System.out.println("|Opcion 2: Realizar retiro           |");
            System.out.println("|Opcion 3: Realizar consulta de saldo|");
            System.out.println("|Opcion 4: Salir                     |");
            System.out.println("--------------------------------------");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuanto desea depositar:");
                    deposito = sc.nextDouble();
                    cajero.Deposito(deposito);
                    cajero.calcularDeposito();
                    cajero.obtenerSaldo();
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar:");
                    retiro = sc.nextDouble();
                    cajero.Retiro(retiro);
                    cajero.calcularRetiro();
                    cajero.obtenerSaldo();
                    break;
                case 3:
                    cajero.obtenerSaldo();
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        }while(menu==true);
    }
}
