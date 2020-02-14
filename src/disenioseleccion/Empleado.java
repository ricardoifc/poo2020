package disenioseleccion;

public class Empleado {

    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    public Empleado(String nombre, int horas, double cuotas, double sueldo) {
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuotas(cuotas);
        this.setSueldo(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCuotas() {
        return cuota;
    }

    public void setCuotas(double cuotas) {
        this.cuota = cuotas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double calcularSueldo() {
        double sueldo;
        if(horas <= 40){
            sueldo = horas * cuota;
        }else{
            sueldo = (40*cuota) + ((horas - 40) * (cuota* 2));
        }
        return sueldo;
    }

    public void obtenerNombre(){
        System.out.println("Nombre de el empleado: " + nombre);
    }
    public void obtenerSueldo(){
        System.out.println("El sueldo del empleado es: " + calcularSueldo());
    }
}