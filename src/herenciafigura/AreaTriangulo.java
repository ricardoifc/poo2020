package herenciafigura;

public class AreaTriangulo extends Figura {
    private double base;
    private double altura;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        area = (base*altura)/2;
    }
    public double getArea() {
        return area;
    }
}
