package herencia;

import org.w3c.dom.ls.LSOutput;

public class Docente extends Persona{
    //Atributos propios de la clase Docente
    private String area;

    /**
     * Constructor para la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Docente(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.area = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void enseniar(){
        System.out.println("Metodo para enseñar");
    }
    public void calificar(){
        System.out.println("Metodo para calificar");
    }
}
