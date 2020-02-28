package herenciaempleado;

public class EmpleadoPorHora extends Empleado{
    // declaracion de variables
    private int hora;
    private double valorHora;

    /**
     * Metodo para hora
     * @return
     */
    public int getHora() {
        return hora;
    }

    /**
     * metodo para conseguir hora
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * metodo para retorno valor hora
     * @return
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * metodo para conseguir valor de hora
     * @param valorHora
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * metodo para calcular sueldo
     * @return
     */
    public double calcularSueldoPorHora(){
        Double sueldo = hora * valorHora;
        return sueldo;
    }
}
