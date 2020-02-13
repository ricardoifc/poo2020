package deber_seleccion;

public class MayorNumero {
    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int numMayor;

    public MayorNumero (int numero1, int numero2, int numero3, int numero4) {
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setNumero3(numero3);
        this.setNumero4(numero4);
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
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
