package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empleados = 0;
        int numEmp = 0;
        int contador = 0;
        String dep, nombre, puesto, rfc;
        int numeroTr, opcion;
        double mensual, valorTra, vendidos, salarioMin;
        System.out.println("Ingresa cuantos empleados vas a ingresar");
        empleados = sc.nextInt();
        empleados = empleados - 1;
        System.out.println(contador);
        System.out.println(empleados);
        String cadena = "\t\t\t\t\t\t\t\tREPORTE DE NÓMINA QUINCENAL\nRFC\t\t\t\tNOMBRE\t\t\tDEPTO" +
                "\t\t\tPUESTO\t\t\tSUELDO QUINCENA\n__________________________________________________________" +
                "___________________________________________________\n";
        while (contador <= empleados){
            System.out.println("empleado #"+ (contador + 1) + "\nINGRESE UN TIPO DE EMPLEADO\n1. Administrativo\n2. Mecanico\n3. Vendedor\n");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    dep = "ADMINISTRATIVO";
                    System.out.println("Ingrese su nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su puesto:");
                    puesto = sc.nextLine();
                    System.out.println("Ingrese su RFC");
                    rfc = sc.nextLine();
                    System.out.println("Ingrese su sueldo mensual");
                    mensual = sc.nextDouble();

                    Administrativo adm = new Administrativo(mensual, nombre,rfc,dep,puesto);
                    adm.calcularSueldoQad();
                    cadena = String.format("%s%s%20s%20s%10s%20.2f\n",
                            cadena, adm.getRfc(), adm.getNombre(),
                            adm.dep, adm.getPuesto(), adm.getQuincenal());
                    break;
                case 2:
                    dep = "MECANICO";
                    System.out.println("Ingrese su nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su puesto:");
                    puesto = sc.nextLine();
                    System.out.println("Ingrese su RFC");
                    rfc = sc.nextLine();
                    System.out.println("Ingrese la cantidad de trabajos realizados");
                    numeroTr = sc.nextInt();
                    System.out.println("Ingrese el valor total de los trabajos realizados");
                    valorTra = sc.nextDouble();
                    Mecanico mec = new Mecanico(valorTra, numeroTr,nombre,rfc,dep,puesto);
                    mec.calcularQuincenal();
                    cadena = String.format("%s%s%20s%15s%15s%20.2f\n" ,cadena, mec.getRfc(), mec.getNombre(),
                            mec.dep, mec.getPuesto(), mec.obtenerQuincenal());
                    break;
                case 3:
                    dep = "VENDEDOR";
                    salarioMin = 400;
                    System.out.println("Ingrese su nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su puesto:");
                    puesto = sc.nextLine();
                    System.out.println("Ingrese su RFC");
                    rfc = sc.nextLine();
                    System.out.println("Ingrese el valor total de las ventas realizadas");
                    vendidos = sc.nextDouble();
                    Vendedor empV = new Vendedor(vendidos, salarioMin, nombre,rfc,dep,puesto);
                    cadena = String.format("%s%s%20s%15s%15s%20.2f\n" ,cadena, empV.getRfc(), empV.getNombre(),
                            empV.dep, empV.getPuesto(), empV.obtenerSueldoQven());
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            contador = contador + 1;
        }
        System.out.printf("%s\nTOTAL %d EMPLEADOS",cadena, contador);
    }
}
