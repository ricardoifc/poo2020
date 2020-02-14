package deber_seleccion;

public class  MayorNumero {
    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int numMayor;

    public MayorNumero (int numero1, int numero2, int numero3, int numero4) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;;
        this.numero4 = numero4;
    }
    public void calcularNumMayor(){
        if((numero1 > numero2) && (numero1 > numero3) && (numero1 > numero4)){
            numMayor = numero1;
        }else{
            if((numero2 > numero3) && (numero2 > numero4)){
                numMayor = numero2;
            }else{
                if (numero3 > numero4){
                    numMayor = numero3;
                }else{
                    numMayor = numero4;
                }
            }
        }
    }
    public void obtenerNumMayor(){
        calcularNumMayor();
        System.out.println("El numero mayor es: "+ numMayor);

    }
}
