package herenciafigura;

public class AreaCuadrado extends Figura {
    private double lado;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        area = lado * lado;
    }
}
