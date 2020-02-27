package herencia;

public class Administrativo extends  Persona{
    private String dependencia;

    public Administrativo(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.dependencia = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }
    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionar_personas(){
        System.out.println("Metodo para gestionar personas");
    }
}
