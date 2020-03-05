package herenciainversionistas;

import herenciaautomotriz.Administrativo;
import herenciaautomotriz.Mecanico;
import herenciaautomotriz.Vendedor;

import java.util.Scanner;

public class EjecutaInversionistas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empleados = 0;
        int contador = 0;
        int opcion;
        String numCu, nombre;
        double capital, plazo;
        System.out.println("Ingresa cuantos inversionistas vas a ingresar");
        empleados = sc.nextInt();
        empleados = empleados - 1;
        System.out.println(contador);
        System.out.println(empleados);
        String cadena = "\t\t\t\t\t\t\t\tREPORTE INVERSIONITAS\nRFC\t\t\t\tNOMBRE\t\t\tDEPTO" +
                "\t\t\tPUESTO\t\t\tSUELDO QUINCENA\n__________________________________________________________" +
                "___________________________________________________\n";
        while (contador <= empleados){
            System.out.println("empleado #"+ (contador + 1) + "\nINGRESE UN TIPO DE EMPLEADO\n1. Ahorro\n2." +
                    " Maestra\n3. Pagare\n");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su N° de cuenta:");
            numCu = sc.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el capital invertido");
            capital = sc.nextDouble();
            System.out.println("Ingrese el plazo de la inversión en años:");
            plazo = sc.nextDouble();
            switch (opcion){
                case 1:
                    Ahorro cA = new Ahorro(numCu, capital, nombre, plazo);
                    cA.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena, contador, cA.getNombre(),
                            cA.getNumeroCuenta() ,cA.getInteres());
                    break;
                case 2:
                    Maestra cM = new Maestra(numCu, capital, nombre, plazo);
                    cM.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena, contador, cM.getNombre(),
                            cM.getNumeroCuenta() ,cM.getInteres());
                    break;
                case 3:
                    Pagare cP = new Pagare(numCu, capital, nombre, plazo);
                    cP.calcularInteres();
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena, contador, cP.getNombre(),
                            cP.getNumeroCuenta() ,cP.getInteres());
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            contador = contador + 1;
        }
        System.out.printf("%s\nTOTAL %d EMPLEADOS",cadena, contador);
    }
}
