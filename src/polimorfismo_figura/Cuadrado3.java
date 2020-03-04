package polimorfismo_figura;

public class Cuadrado3 extends Figura3{
    private double ladoCuad;

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = ladoCuad*ladoCuad;
    }
}
