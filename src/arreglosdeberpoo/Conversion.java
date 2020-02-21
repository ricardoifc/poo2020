package arreglosdeberpoo;

public class Conversion {
    /**
     * Declaracion de variables
     */
    private String numero;
    private int decimal;
    private String separar[] = new String[5];

    /**
     * Metodo Constructor
     ** Obtencion de numero binario
     * @param num
     */
    public Conversion(String num){
        this.numero = num;
    }

    /**
     * Metodo para calcular el numero decimal de el numero binario
     */
    public void calcularConversion(){
        separar= numero.split("");
        int contador = 5;
        for(int i=0; i < separar.length; i++){
            decimal = (int) (decimal + ((Integer.parseInt(separar[i])) * Math.pow(2, contador)));
            contador = contador -1;
        }
    }

    /**
     * Metodo para presentar el numero binario y decimal
     */
    public void presentacion(){
        System.out.println("Numero Binario: " + numero);
        System.out.println("Numero Decimal: " + decimal);
    }
}
