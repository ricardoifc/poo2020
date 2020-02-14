package taller_repeticion;

public class Factorial {
    private  int numero=0;
    private int factorial=1;
    public Factorial(int numero){
        this.numero=numero;
    }

    /**
     * este metodo sirve para calcular el factorial d eun numero
     * @param n
     * @return
     */
    public int calcular_factorial(int n){
        for(int i=1;i<=n;i++) {
            factorial=factorial*i;
        }
        return factorial;
    }

    public int getFactorial() {
        return factorial;
    }
}
