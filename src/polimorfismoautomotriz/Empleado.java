package polimorfismoautomotriz;

public abstract class Empleado {
    protected String rfc;
    protected String nombre;
    protected String dep;
    protected String puesto;
    protected double sueldoQuincenal;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public abstract void calcularSueldoQna();
}
