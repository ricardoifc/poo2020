package herenciaempleado;

public class EmpleadoPorHora extends Empleado{
    private int hora;
    private double valorHora;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double calcularSueldoPorHora(){
        Double sueldo = hora * valorHora;
        return sueldo;
    }
}
