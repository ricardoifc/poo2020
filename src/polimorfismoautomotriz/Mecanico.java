package polimorfismoautomotriz;

public class Mecanico extends Empleado {
    private int numeroTrab;
    private double sueldoquincenal, valorTrab;

    public Mecanico(double valorTrab, int numeroTrab, String nombre, String rfc, String dep, String puesto) {
        this.valorTrab = valorTrab;
        this.numeroTrab = numeroTrab;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    @Override
    public void calcularSueldoQna() {
        sueldoquincenal = (valorTrab * numeroTrab) * 0.04;
    }

}
