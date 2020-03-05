package polimorfismovolumen;

public class Esfera extends Figura {
    private double radio, volEs;

    public Esfera(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }
    @Override
    public void calcularVolumen() {
        volumen = (4* Math.PI *Math.pow(radio, 3))/3;
    }
}
