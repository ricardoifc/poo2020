package taller1;

public class Vehiculo {
    private String marca;
    private String asientos;
    private String color;
    private String modelo;
    private String placas;
    private String tipo_modelo;

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getAsientos() {
        return asientos;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public String getTipo_modelo() {
        return tipo_modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setTipo_modelo(String tipo_modelo) {
        this.tipo_modelo = tipo_modelo;
    }
}
