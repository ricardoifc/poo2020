package proyectopoo;

public abstract class Market {
    protected String codigo;
    protected String tipoProducto;
    protected String nombreProducto;
    protected int cantidad;
    protected double valorU;

    public abstract void calcularIVA();
    public abstract void calcularPrecio();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valor) {
        this.valorU = valor;
    }
}
