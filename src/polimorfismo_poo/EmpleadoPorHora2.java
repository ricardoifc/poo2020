package polimorfismo_poo;

public class EmpleadoPorHora2 extends Empleado12 {
    // atributos propios de la clase EmpleadoPorHoras2
    private double horas_trabajadas;
    private double cuota_por_hora;

    // Tambien se extiende los atributos de la clase principal
    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }
    public void setCuota_por_hora(double cuota_por_hora) {
        this.cuota_por_hora = cuota_por_hora;
    }


    @Override
    public void calcularSueldoQna() {
        sueldo =horas_trabajadas * cuota_por_hora;
    }
    //Tambien se extiende de los metodos de las clases
}
