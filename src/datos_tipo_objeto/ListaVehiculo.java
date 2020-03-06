package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo> ();
        int opcion;
        boolean bandera = true;
        System.out.println ("SISTEMA DE INGRESO DE VEHICULOS");
        do {
            System.out.println ("----------------------------\n1. Agregar nuevo vehiculo\n2.Presentar vehiculoS" +
                    "\n3.Salir\nElija una opcion\n----------------------------");
            opcion = sc.nextInt();
            sc.nextLine ();
            switch (opcion){
                case 1:
                    Vehiculo vehiculo = new Vehiculo ();
                    System.out.println ("Ingresa la placa\n----------------------------");
                    vehiculo.setPlaca (sc.nextLine ());
                    System.out.println ("Ingresa la marca\n----------------------------");
                    vehiculo.setMarca (sc.nextLine ());
                    System.out.println ("Ingresa la modelo\n----------------------------");
                    vehiculo.setModelo (sc.nextLine ());
                    System.out.println ("Ingresa la color\n----------------------------");
                    vehiculo.setColor (sc.nextLine ());
                    System.out.println ("Ingresa la año\n----------------------------");
                    vehiculo.setAnio (sc.nextInt ());
                    System.out.println ("Ingresa la cilindraje\n----------------------------");
                    vehiculo.setCilindraje (sc.nextInt ());
                    sc.nextLine ();
                    vehiculos.add (vehiculo);
                    break;
                case 2:
                    //System.out.println ("----------------------------\nPlaca\tMarca\tCilindraje");
                    System.out.println ("FICHA DE VEHICULOS");
                    //System.out.printf("%6s%15s%15s%15s%15s%15s\n","Placa ","Marca","Modelo","Año","Cilindraje","Color");
                    for(Vehiculo v: vehiculos){
                        System.out.println ("---------------------");
                        System.out.println ("Placa: " + v.getPlaca ());
                        System.out.println ("Marca: " + v.getMarca ());
                        System.out.println ("Modelo: " + v.getModelo ());
                        System.out.println ("Año: " + v.getAnio ());
                        System.out.println ("Cilindraje :" + v.getCilindraje ());
                        System.out.println ("Color: " + v.getColor ());
                        System.out.println ("---------------------");
                        /*System.out.printf("%6s%15s%15s%15s%15s%15s\n",v.getPlaca (),v.getModelo (),v.getModelo (),
                                v.getAnio (),v.getCilindraje (),v.getColor ());*/


                        // System.out.println (v.getPlaca () + "\t\t\t" + v.getMarca () + "\t\t\t" + v.getCilindraje ());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println ("Opcion incorrecta");
            }
        }while (bandera);
    }
}
