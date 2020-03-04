package polimorfismo_figura;

public class Circulo3 extends Figura3{

    private double radioCirc;

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * (radioCirc * radioCirc);;
    }
}
