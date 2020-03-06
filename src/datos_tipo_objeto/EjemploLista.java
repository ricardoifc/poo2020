package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Creacion de una lista en java
        // para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String> ();
        universidades.add("UTPL");
        System.out.println ("Tamano de la lista: " + universidades.size ());
        universidades.add ("ESPOL");
        System.out.println ("Tamano de la lista: " + universidades.size ());
        universidades.add ("UNL");
        System.out.println ("Tamano de la lista: " + universidades.size ());
        //eliminacion del elemeto de la posicion 1
        universidades.remove (1);
        System.out.println ("Tamano de la lista luego de eliminar elemento: " + universidades.size ());
        System.out.println ("VALORES DE LA LISTA");
        //Remplazar un elemento de la posicion 1
        universidades.set (1,"UIDE");
        universidades.add (1, "UNL");
        /*
        for (int i = 0; i <= (universidades.size ()-1) ; i++) {
            System.out.println (universidades.get (i));
        }*/

        for (String univ: universidades) {
            System.out.println (univ);

        }
    }

}
