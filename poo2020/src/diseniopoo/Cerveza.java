package diseniopoo;

public class Cerveza {
    private double precio;
    private int unidades_vendides;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidades_vendides, String nombre, String tipo){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setTipo(tipo);
        this.setUnidades_vendides(unidades_vendides);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendides() {
        return unidades_vendides;
    }

    public void setUnidades_vendides(int unidades_vendides) {
        this.unidades_vendides = unidades_vendides;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcular_ventas() {
        double ventas = precio*unidades_vendides;
        return ventas;
    }
    public void presentacion(){
        System.out.printf("Cerveza: %s\nTipo: %s\nPrecio: %s\nUnidades Vendidas: %s\n\nTotal Ventas: %s", getNombre(),
                getTipo(), getPrecio(), getUnidades_vendides(), calcular_ventas());
    }
}
