package herenciaempleado;

public class EmpleadoAsalariado extends Empleado{
    private double valor_mensual;

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }
    public double calcularSueldoMensual(){
        double sueldo = valor_mensual;
        return sueldo;
    }
}
