package polimorfismovolumen;

public abstract class Figura {
    protected String nombreF;
    protected double volumen;

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public abstract void calcularVolumen();
}
