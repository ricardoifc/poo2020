package arreglosdeberpoo;

public class Cedula {
    /**
     * Declaracion de objetos
     */
    private int[] cedula;
    private int suma = 0;

    /**
     * Metodo constructor
     * obtencion de array cedula
     * @param cedula
     */
    public Cedula(int[] cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para calcular la suma de los numeros de la cedula
     */
    public void calcularCedula(){
        int temp;
        for(int i =0; i<=8;i= i+2){
            //System.out.print(cedula[i});
            temp = cedula[i] * 2;
            //System.out.print(temp);
            if (temp >= 10){
                temp = temp - 9;
            }
            //System.out.print(temp);
            suma = temp + suma;
            //System.out.print(suma + "|\n");
        }
        for(int j =1; j<=7;j= j+2){
            suma = suma + cedula[j];
        }
        // System.out.println(suma);
    }

    /**
     * Metodo para comprobacion de el ultimo digito de la cedula
     */
    public void comprobarCedula(){
        if(suma <= 10){
            suma = 10  - suma;
        }else{
            if(suma <= 20){
                suma = 20  - suma;
            }else{
                if(suma <= 30){
                    suma = 30  - suma;
                }else{
                    if(suma <= 40){
                        suma = 40  - suma;
                    }else{
                        if(suma <= 50){
                            suma = 50  - suma;
                        }else{
                            if(suma <= 60){
                                suma = 60  - suma;
                            }
                        }
                    }
                }
            }
        }
        //System.out.println(suma);

    }

    /**
     * Metpodo para imprimir el resultado de la cedula
     * Si el ultimo digito es correcto imprimme correcto.
     */
    public void presentar(){
        System.out.print("La Cedula ");
        for (int i = 0; i <= 9; i++){
            System.out.print(cedula[i]);
        }
        if (suma == cedula[9]){
            System.out.print(" es correcta!!!");
        }else{
            System.out.print(" es incorrecto!!!");
        }

    }
}
