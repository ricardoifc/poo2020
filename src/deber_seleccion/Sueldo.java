package deber_seleccion;

public class Sueldo {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo = 0;

    public Sueldo (String nombre, int horas, double cuota) {
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuota(cuota);
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


    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    public void calcularSueldo() {
        if(horas <= 40){
            sueldo = horas * cuota;
        }else{
            if(horas<=50){
                sueldo = (40*cuota) + ((horas - 40) * (cuota* 2));
            }else{
                sueldo = (40*cuota) + (10*cuota*2)+((horas - 50) * (cuota* 3));
            }
        }

    }

    public void obtenerNombre(){
        System.out.println("Nombre de el empleado: " + nombre);
    }
    public void obtenerSueldo(){
        calcularSueldo();
        System.out.println("El sueldo del empleado es: " + sueldo);
    }
}
