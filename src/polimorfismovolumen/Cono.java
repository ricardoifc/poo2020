package polimorfismovolumen;

public class Cono extends Figura {
    private double radio, altura, volCono;

    public Cono(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }
    @Override
    public void calcularVolumen() {
        volumen = ((Math.PI * Math.pow(radio,2)*altura))/3;
    }
}

