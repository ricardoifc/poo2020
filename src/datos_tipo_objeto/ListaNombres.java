package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<String> nombres = new ArrayList<String> ();
        int opcion;
        boolean bandera = true;
        do {
            System.out.println ("----------------------------\n1. Agregar nuevo nombre\n2.Presentar lista de nombres\n" +
                    "3.Salir\nElija una opcion\n----------------------------");
            opcion = sc.nextInt();
            sc.nextLine ();
            switch (opcion){
                case 1:
                    System.out.println ("Ingresa un nombre\n----------------------------");
                    nombres.add (sc.nextLine ());
                    break;
                case 2:
                    System.out.println ("----------------------------\nLa lista es:");
                    for (int i = 0; i <= (nombres.size () -1) ; i++) {
                        System.out.println (i+1 + ". " +nombres.get (i));
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
