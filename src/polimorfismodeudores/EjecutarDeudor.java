package polimorfismodeudores;

import herencia.Persona;
import polimorfismoinversionistas.Ahorro;
import polimorfismoinversionistas.Maestra;
import polimorfismoinversionistas.Pagare;

import java.util.Scanner;

public class EjecutarDeudor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int empleados = 0;
            int contador = 0;
            int opcion;
            String numCu, nombre, cedula;
            double capital, plazo;
            System.out.println("Ingresa cuantos deudores va a ingresar");
            empleados = sc.nextInt();
            empleados = empleados - 1;
            System.out.println(contador);
            System.out.println(empleados);
            String cadena = "\t\t\t\t\t\t\tREPORTE DEUDORES\nNo. Cliente\t\t\tNombre\t\tNo. Cuenta\t\t" +
                    "Interés por pagar/mensual\t\tTOTAL INTERESES\t\tTOTAL A PAGAR" +
                    "\n________________________________________________________________________________________________" +
                    "_____________\n";
            while (contador <= empleados) {
                System.out.println("empleado #" + (contador + 1) + "\nIngrese tipo de deuda\n1. Auto\n2." +
                        " Hipotecario\n3. Personal\n");
                opcion = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese su nombre:");
                nombre = sc.nextLine();
                System.out.println("Ingrese su número de cedula:");
                cedula = sc.nextLine();
                System.out.println("Ingrese su numero de cuenta:");
                numCu = sc.nextLine();
                System.out.println("Ingrese el capital a recibir:");
                capital = sc.nextDouble();
                System.out.println("Ingrese el plazo en años del prestamo hipotecario:");
                plazo = sc.nextDouble();
                switch (opcion) {
                    case 1:
                        Auto aut = new Auto(nombre, cedula, capital, plazo, numCu);
                        aut.calcularInteres();
                        cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador,
                                aut.getNombre(), aut.getNumeroC(), aut.getInteresM(), aut.getTotal(),
                                aut.getTotal() + capital);
                        break;
                    case 2:
                        Hipotecario hip = new Hipotecario(nombre, cedula, capital, plazo, numCu);
                        hip.calcularInteres();
                        cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador,
                                hip.getNombre(), hip.getNumeroC(), hip.getInteresM(), hip.getTotal(),
                            hip.getTotal() + capital);
                        break;
                    case 3:
                        Personal per = new Personal(nombre, cedula, capital, plazo, numCu);
                        per.calcularInteres();
                        cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador,
                                per.getNombre(), per.getNumeroC(), per.getInteresM(), per.getTotal(),
                                per.getTotal() + capital);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
                contador = contador + 1;
            }
            System.out.printf("%s\nTOTAL %d EMPLEADOS", cadena, contador);
    }
}
