package arreglosdeberpoo;

public class Ficha {
    /**
     * Declaracion de variables
     */
    private String nombre;
    private String edad;
    private String universidad;
    private String celular;
    private String datosAlumnos[][] = new String[5][4];

    /**
     * Metodo constructor para obtencion de datos de estudiante
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public void obtenerDatos(String nombre, String edad, String universidad, String celular){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }

    /**
     * metodo para establecer los datos al array de 2 dimensiones
     * @param contador
     */
    public void almacenarArreglo(int contador){
        datosAlumnos[contador][0]=nombre;
        datosAlumnos[contador][1]=edad;
        datosAlumnos[contador][2]=universidad;
        datosAlumnos[contador][3]=celular;
    }

    /**
     * Metodo para presentar los datos de los estudiatnes
     */
    public void presentar() {
        for (int i = 0; i <=4;i++){
            System.out.println("\nNombre: "+ datosAlumnos[i][0]);
            System.out.println("Edad: "+ datosAlumnos[i][1]);
            System.out.println("Universidad: "+ datosAlumnos[i][2]);
            System.out.println("Celular: "+ datosAlumnos[i][3] );
        }

    }
}
