package herenciavolumen;

public class Cubo extends  Figura{
    private double arista, volC;

    public Cubo(double arista, String nombre) {
        this.arista = arista;
        this.nombreF = nombre;
    }

    public void calcularVol(){
        volC = Math.pow(arista, 3);
    }
    public double obtenerVolCubo(){
        return volC;
    }
}
