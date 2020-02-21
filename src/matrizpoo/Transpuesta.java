package matrizpoo;

public class Transpuesta {
    /**
     * Declaracion de variables
     */
    private int iTam;
    private int jTam;
    private int matriz[][];
    private int transpuesta[][];

    /**
     * Metodo constructor
     * obtencion de valor fila, columna y la matriz
     * @param iTam
     * @param jTam
     * @param matriz
     */
    public Transpuesta(int iTam, int jTam, int[][] matriz) {
        this.iTam = iTam;
        this.jTam = jTam;
        this.matriz = new int[iTam][jTam];
        this.matriz = matriz;
        this.transpuesta = new int[jTam][iTam];

    }

    /**
     * Metodo para calcula la matriz transpuesta
     */
    public void calcularTraspuesta(){
        for(int i = 0; i<=(jTam-1); i++){
            for(int j = 0; j<=(iTam-1); j++){
                transpuesta[i][j] = matriz[j][i];
            }
        }
    }

    /**
     * Metodo para Presenta la matriz
     */
    public void presentarMatriz(){
        for(int i = 0; i<=(iTam-1); i++){
            for(int j = 0; j<=(jTam-1); j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    /**
     * Metodo para mostrar matriz transpuesta
     */
    public void presentarTranspuesta(){
        for(int i = 0; i<=(jTam-1); i++){
            for(int j = 0; j<=(iTam-1); j++){
                System.out.print(transpuesta[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
