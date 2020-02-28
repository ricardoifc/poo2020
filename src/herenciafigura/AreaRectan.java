package herenciafigura;

public class AreaRectan extends Figura {
    private double altura;
    private double base;
    private double area;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calcularArea(){
        area = base * altura;
    }
    public double getArea() {
        return area;
    }
}
