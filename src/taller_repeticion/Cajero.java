package taller_repeticion;

public class Cajero {
    private double saldo;
    private double deposito;
    private double retiro;
    public Cajero(double saldo){
        this.saldo=saldo;
    }
    public void Deposito(double deposito){
        this.deposito=deposito;
    }
    public void calcularDeposito(){
        saldo = deposito + saldo;
    }
    public void Retiro(double retiro){
        this.retiro = retiro;
    }
    public void calcularRetiro(){
        saldo = saldo - retiro;
    }
    public void obtenerSaldo(){
        System.out.println("El saldo actual es: " +saldo);
    }
}
