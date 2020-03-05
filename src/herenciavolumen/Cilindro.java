package herenciavolumen;

public class Cilindro extends  Figura{
    private double radio, altura, volCil;

    public Cilindro(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }
    public void calcularVol(){
        volCil = Math.PI *Math.pow(radio, 2)* altura;
    }
    public double obtenerVolCilindro(){
        return volCil;
    }
}
