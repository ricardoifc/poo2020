package polimorfismovolumen;

public class Cilindro extends Figura {
    private double radio, altura;

    public Cilindro(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.PI * Math.pow(radio, 2) * altura;
    }
}
