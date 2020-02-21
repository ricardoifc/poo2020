package matrizpoo;

public class SumaPromedio {
    private int iTam;
    private int jTam;
    private int[][] matriz;
    private float suma;
    private float promedio;
    /**
     * Metodo Constructor
     * Obtener fila y columna y la matriz
     * @param iTam
     * @param jTam
     * @param matriz
     */
    public SumaPromedio(int iTam, int jTam, int[][]matriz){
        this.iTam = iTam;
        this.jTam = jTam;
        this.matriz = new int[iTam][jTam];
        this.matriz = matriz;
    }

    /**
     * Metodo para calcular la suma
     * @return
     */
    public float calcularSuma(){
        for(int i = 0; i<=(iTam-1); i++){
            for(int j = 0; j<=(jTam-1); j++){
                suma = suma +matriz[i][j];
            }
        }
        return suma;
    }

    /**
     * Metodo para calcular el promedio
     * @return
     */
    public float calcularPromedio(){
        promedio = suma / (iTam * jTam);
        return promedio;
    }

    /**
     * Metodo para mostrar la matriz
     */
    public void presentarMatriz(){
        for(int i = 0; i<=(iTam-1); i++){
            for(int j = 0; j<=(jTam-1); j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
