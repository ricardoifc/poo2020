package polimorfismoinversionistas;

public class Ahorro extends Inversionista {
    private double capital;
    public Ahorro(String numeroCuenta, double capital, String nombre, double plazo ) {
        this.capital = capital;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.plazo = plazo;
        this.taza = getTaza();

    }

    @Override
    public void calcularInteres() {
        interes = capital * (taza / 100) * plazo;
    }
}
