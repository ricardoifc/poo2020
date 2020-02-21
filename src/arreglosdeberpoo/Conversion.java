package arreglosdeberpoo;

public class Conversion {
    /**
     * Declaracion de variables
     */
    private String numero;
    private int decimal;

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
        String separar[] = numero.split("");
        int contador = 5;
        int temp;
        for(int i=0; i < separar.length; i++){
            decimal = (int) (decimal + (Integer.parseInt(separar[i]) * Math.pow(2, contador)));
            contador--;
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
