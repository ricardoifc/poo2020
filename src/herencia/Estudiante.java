package herencia;

/**
 * Clase que hereda de la clase Persona
 * Contendra todos los atributos y métodos definidos en Persona
 */

public class Estudiante extends Persona {

    /**
     * Constructor para la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }
    //Atributos propios de la clase Estudiante
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricular(){
        System.out.println("Metodo para matricular");
    }
    public void aprender(){
        System.out.println("Metodo para aprender");
    }
}
