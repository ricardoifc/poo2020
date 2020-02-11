package taller1;

public class Celular {

    private String marca;
    private String modelo;
    private String mumero;
    private String almacenamiento;
    private String color;
    private String sistemaOperativo;

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMumero() {
        return mumero;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMumero(String mumero) {
        this.mumero = mumero;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

}
