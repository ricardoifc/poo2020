package examem;

import datos_tipo_objeto.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjecutarVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, horas , anio;
        String modelo, marca, tipoVeh;
        boolean bandera = true;
        do {
            System.out.println ("1.Vehiculo Pequeño\n2.Vehiculo Mediano\n3.Vehiculo Grande\n3.Salir\n");
            opcion = sc.nextInt();
            sc.nextLine ();
            System.out.println("Ingrese el modelo");
            modelo = sc.nextLine();
            System.out.println("Ingrese la marca");
            marca = sc.nextLine();
            System.out.println("Ingrese el tipo de vehiculo, ejemplo camioneta, tanquero...");
            tipoVeh = sc.nextLine();
            System.out.println("Ingrese el año del vehiculo");
            anio = sc.nextInt();
            System.out.printf("Ingrese horas de lavado");
            horas = sc.nextInt();
            switch (opcion){
                case 1:
                    Pequenio peq = new Pequenio();
                    peq.setModelo(modelo);
                    peq.setMarca(marca);
                    peq.setTipoAuto(tipoVeh);
                    peq.setAnio(anio);
                    peq.setHora(horas);
                    peq.calcularTotal();
                    System.out.println(peq.getTotal());

                    break;
                case 2:
                    Mediano med = new Mediano();
                    med.setModelo(modelo);
                    med.setMarca(marca);
                    med.setTipoAuto(tipoVeh);
                    med.setAnio(anio);
                    med.setHora(horas);
                    med.calcularTotal();
                    System.out.println(med.getTotal());

                    break;
                case 3:
                    Grande gra = new Grande();
                    gra.setModelo(modelo);
                    gra.setMarca(marca);
                    gra.setTipoAuto(tipoVeh);
                    gra.setAnio(anio);
                    gra.setHora(horas);
                    gra.calcularTotal();
                    System.out.println(gra.getTotal());

                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println ("Opcion incorrecta");
            }
        }while (bandera);

    }
}
