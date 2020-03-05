package herenciavolumen;

public class Esfera extends  Figura{
    private double radio, volEs;

    public Esfera(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }

    public void calcularVol(){
        volEs = (4* Math.PI *Math.pow(radio, 3))/3;
    }
    public double obtenerVolEsf(){
        return volEs;
    }
}
