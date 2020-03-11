package proyectopoo;

import datos_tipo_objeto.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjecutarMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Producto> productos = new ArrayList<Producto>();
        int opcion;
        boolean opcionVenta;
        String codigo;
        int cantidad;\
        boolean bandera = true;
        System.out.println ("Market");
        do {
            System.out.println ("----------------------------\n1. Agregar nuevo producto\n2.Presentar vehiculoS" +
                    "\n3.Salir\nElija una opcion\n----------------------------");
            opcion = sc.nextInt();
            sc.nextLine ();
            switch (opcion){
                case 1:
                    Producto prod = new Producto();
                    System.out.println ("Ingresa Codigo\n----------------------------");
                    prod.setCodigo(sc.nextLine());
                    System.out.println("Nombre");
                    prod.setNombreProducto (sc.nextLine ());
                    System.out.println("Tipo");
                    prod.setTipoProducto(sc.nextLine());
                    System.out.println("Cantidad");
                    prod.setCantidad(sc.nextInt());
                    System.out.println("Valor Unitario");
                    prod.setValorU(sc.nextDouble());
                    productos.add(prod);
                    break;
                case 2:
                    opcionVenta = true;
                    do {
                        System.out.println("Venta");
                        System.out.println("Ingrese codigo");
                        codigo = sc.nextLine();
                        System.out.println("Ingrese cantidad");
                        cantidad = sc.nextInt();
                        for (Producto p : productos) {
                            System.out.println("---------------------");
                            System.out.println("cod: " + p.getCodigo());
                            System.out.println("NOMBRE: " + p.getNombreProducto());
                            System.out.println("tipo: " + p.getTipoProducto());
                            System.out.println("canti: " + p.getCantidad());
                            System.out.println("valor: " + p.getValorU());
                            System.out.println("---------------------");
                        }
                    }while (opcionVenta);
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
