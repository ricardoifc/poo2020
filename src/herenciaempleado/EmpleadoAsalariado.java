package herenciaempleado;

public class EmpleadoAsalariado extends Empleado{
    // declaracion de variables
    private double valor_mensual;

    /**
     * metodo para retornar valor mensual
     * @return
     */
    public double getValor_mensual() {
        return valor_mensual;
    }

    /**
     * metodo para obtener valor mensual
     * @param valor_mensual
     */
    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

    /**
     * metodo para calcular sueldo mensual
     * @return
     */
    public double calcularSueldoMensual(){
        double sueldo = valor_mensual;
        return sueldo;
    }
}
