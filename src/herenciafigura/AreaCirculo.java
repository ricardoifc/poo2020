package herenciafigura;

public class AreaCirculo extends Figura{
    private double radio;
    private double area;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        area = Math.PI * (radio * radio);
    }
}
