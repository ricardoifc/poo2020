package herenciadeudores;

public class Deudor {
    protected String nombre;
    protected String ci;
    protected String numeroC;
    protected double capital;
    protected double plazos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getPlazos() {
        return plazos;
    }

    public void setPlazos(double plazos) {
        this.plazos = plazos;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }
}
