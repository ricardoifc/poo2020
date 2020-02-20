package arreglospoo;

public class Array {
    /**
     * Declaracion de variables
     */
    private int [] vectorA = new int[10];
    private int [] vectorB = new int[10];
    private int sumatoria = 0;

    /**
     * Metodo constructor
     * @param vectA
     * @param vectB
     */
    public Array(int []vectA, int []vectB){
        this.vectorA=vectA;
        this.vectorB=vectB;
    }

    /**
     * Metodo para calcular la suma de los vetores multiplicados
     */
    public void calcularSumatoria(){
        for(int i = 0; i<vectorA.length; i++){
            sumatoria = sumatoria + (vectorA[i] * vectorB[i]);
        }
    }

    /**
     * Metodo para presentar los vectores A y B y la suma
     */
    public void presentar(){
        System.out.print("Vector A: " );
        for(int i = 0; i<vectorA.length; i++){
            System.out.print(vectorA[i] + " ");
        }
        System.out.print("\nVector B: " );
        for(int i = 0; i<vectorB.length; i++){
            System.out.print(vectorB[i] + " ");
        }
        System.out.println("\nSumatoria : " + sumatoria);
    }
}
