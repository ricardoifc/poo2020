package deber_seleccion;

public class Calificacion {
    /**
     * Declaracion de variables
     */
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double calificacion4;
    private double promedio;
    private String comentario;

    /**
     * Metodo constructor
     * @param nombre
     * @param calificacion1
     * @param calificacion2
     * @param calificacion3
     * @param calificacion4
     */
    public Calificacion(String nombre, double calificacion1, double calificacion2, double calificacion3, double
            calificacion4) {
        this.setNombre(nombre);
        this.setCalificacion1(calificacion1);
        this.setCalificacion2(calificacion2);
        this.setCalificacion3(calificacion3);
        this.setCalificacion4(calificacion4);
    }

    /**
     * obtencion nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * establecer nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtencion calificacion 1
     * @return
     */
    public double getCalificacion1() {
        return calificacion1;
    }
    /**
     * establecer calificacion 1
     */
    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }
    /**
     * obtencion calificacion 1
     * @return
     */
    public double getCalificacion2() {
        return calificacion2;
    }
    /**
     * establecer calificacion 2
     */
    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }
    /**
     * obtencion calificacion 3
     * @return
     */
    public double getCalificacion3() {
        return calificacion3;
    }
    /**
     * establecer calificacion 3
     */
    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }
    /**
     * obtencion calificacion 4
     * @return
     */
    public double getCalificacion4() {
        return calificacion4;
    }
    /**
     * establecer calificacion 4
     */
    public void setCalificacion4(double calificacion4) {
        this.calificacion4 = calificacion4;
    }

    /**
     * Metodo para calcular el promedio
     */
    public void calcularPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;
    }

    /**
     * metodo para calcular el comentario
     */
    public void calcularComentario(){
        if (promedio <= 60){
            comentario = "Aprovado";
        }else{
            comentario = "Reprobado";
        }
    }

    /**
     * metodo para mostrar el nombre
     */
    public void obtenerNombre() {
        System.out.println("El nombre del estuduiante es "+ nombre);
    }

    /**
     * metodo para mostrar el promedio
     */
    public void obtenerPromedio(){
        calcularPromedio();
        System.out.println("El promedio es " + promedio);
    }

    /**
     * metodo para mostrar el comentario
     */
    public void obtenerComentario(){
        calcularComentario();
        System.out.println("El estudiante a " + comentario);
    }
}
