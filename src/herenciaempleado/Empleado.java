package herenciaempleado;

public class Empleado {

    // declaracion de variables en protected
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    /**
     * metodo para retorno nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para obtener nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para retorno cargo
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * metodo para obtenmer cargo
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * metodo para retorno dependencia
     * @return
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * metodo para obtener dependencia
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
