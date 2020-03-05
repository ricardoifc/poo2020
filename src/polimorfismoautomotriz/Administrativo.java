package polimorfismoautomotriz;

public class Administrativo extends Empleado {
    private double mensual;

    public Administrativo(double mensual, String nombre, String rfc, String dep, String puesto) {
        this.mensual = mensual;
        this.nombre = nombre;
        this.rfc= rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    @Override
    public void calcularSueldoQna() {
        sueldoQuincenal = mensual / 2;
    }
}
