package taller1;

public class EjecutarTaller {
    public static void main(String[] args) {
        //creacion de objeto ficha
        Estudiante estudiante = new Estudiante();
        estudiante.setCedula("112123");
        estudiante.setEdad(19);
        estudiante.setGenero("masculino");
        estudiante.setNombre("ricardo");
        estudiante.setPromedio(13);
        String mostrar_ficha = estudiante.obtener_fichaEstudiante();
        System.out.println(mostrar_ficha);

        Docente docente = new Docente();
        docente.setEdad("30");
        docente.setGenero("Masculino");
        docente.setN_cedula("1120938");
        docente.setNivel_academico("bachiller");
        docente.setNombre("pedro");
    }
}
