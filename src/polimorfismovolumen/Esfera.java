package polimorfismovolumen;

public class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularVolumen() {
        volumen = (4* Math.PI *Math.pow(radio, 3))/3;
    }
}
