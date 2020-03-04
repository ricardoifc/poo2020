package herenciaautomotriz;

public class Administrativo extends Empleado {
    private double quincenal;
    private double mensual;

    public Administrativo(double mensual, String nombre, String rfc, String dep, String puesto) {
        this.mensual = mensual;
        this.nombre = nombre;
        this.rfc= rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    public void calcularSueldoQad(){
        quincenal = mensual / 2;
    }

    public double getQuincenal(){
        return  quincenal;
    }

}
