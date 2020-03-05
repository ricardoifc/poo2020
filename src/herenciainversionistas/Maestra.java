package herenciainversionistas;

public class Maestra extends Inversionista{
    private double capital;

    public Maestra(String numeroCuenta, double capital, String nombre, double plazo) {
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    public void calcularInteres(){
       interes = capital * (taza / 100) * plazo;
    }
    public double getInteres(){
        return interes;
    }

}
