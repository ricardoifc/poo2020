package polimorfismovolumen;

public class Cubo extends Figura {
    private double arista, volC;

    public Cubo(double arista, String nombre) {
        this.arista = arista;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista, 3);
    }
}