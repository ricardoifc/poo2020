package herenciaautomotriz;
public class Vendedor extends Empleado {
    private double ventas, salarioMin, sueldoquincenal;

    public Vendedor(double ventas, double salarioMin, String nombre, String rfc, String dep, String puesto) {
        this.ventas = ventas;
        this.salarioMin = salarioMin;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }
    public double obtenerSueldoQven(){
        sueldoquincenal = salarioMin + (0.02*ventas);
        return sueldoquincenal;
    }
}
