package matrizpoo;

public class SumaMatrices {
    private int matrizA[][] = new int [3][3];
    private int matrizB[][] = new int [3][3];
    private int matrizC[][] = new int [3][3];

    public SumaMatrices(int [][]matrizA, int [][]matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
    public int[][] calcularSuma(){
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                matrizC[i][j]= matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
    public void presentar(int[][] matriz){
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
