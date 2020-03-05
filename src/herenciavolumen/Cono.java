package herenciavolumen;

public class Cono extends  Figura{
    private double radio, altura, volCono;

    public Cono(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }
    public void calcularVol(){
        volCono = ((Math.PI * Math.pow(radio,2)*altura))/3;
    }
    public double obtenerVolCOno(){
        return volCono;
    }
}

