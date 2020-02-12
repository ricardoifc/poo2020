package taller1;

public class Estudiante {
    //definicion de atributos globales
    private String nombre;
    private int edad;
    private String cedula;
    private double promedio;
    private String genero;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para obtener el valor de la variable cedula
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para obtener el valor de la variable promedio
     * @return
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Metodo para obtener el valor de la variable genero
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Metodo para obtener ficha estudiante
     * @return ficha
     */
    public String obtener_fichaEstudiante() {
        String ficha = nombre + "con edad:"+edad+"\nCedula: "+cedula +" genero:"+genero+"\npromedio: "+promedio;
        return ficha;
    }


    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @param promedio
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


}
