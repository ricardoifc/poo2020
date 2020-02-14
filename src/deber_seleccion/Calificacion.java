package deber_seleccion;

public class Calificacion {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double calificacion4;
    private double promedio;
    private String comentario;

    public Calificacion(String nombre, double calificacion1, double calificacion2, double calificacion3, double
            calificacion4) {
        this.setNombre(nombre);
        this.setCalificacion1(calificacion1);
        this.setCalificacion2(calificacion2);
        this.setCalificacion3(calificacion3);
        this.setCalificacion4(calificacion4);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public double getCalificacion4() {
        return calificacion4;
    }

    public void setCalificacion4(double calificacion4) {
        this.calificacion4 = calificacion4;
    }
    public void calcularPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;
    }
    public void calcularComentario(){
        if (promedio <= 60){
            comentario = "Aprovado";
        }else{
            comentario = "Reprobado";
        }
    }
    public void obtenerNombre() {
        System.out.println("El nombre del estuduiante es "+ nombre);
    }
    public void obtenerPromedio(){
        calcularPromedio();
        System.out.println("El promedio es " + promedio);
    }
    public void obtenerComentario(){
        calcularComentario();
        System.out.println("El estudiante a " + comentario);
    }
}
