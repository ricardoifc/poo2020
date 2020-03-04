package polimorfismo_figura;

public class Triangulo3 extends Figura3{
    private double baseTria;
    private double alturaTria;

    public void establecerBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public void establecerAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    @Override
    public void calcularArea() {
        area = (baseTria*alturaTria)/2;
    }
}
