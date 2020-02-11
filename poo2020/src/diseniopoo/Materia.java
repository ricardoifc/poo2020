package diseniopoo;

public class Materia {
    private String nombreEstudiante;
    private String nombreMateria;
    private double bimestre1;
    private double bimestre2;

    public Materia(String nombreEstudiante, String nombreMateria, double bimestre1, double bimestre2){
        this.setNombreEstudiante(nombreEstudiante);
        this.setNombreMateria(nombreMateria);
        this.setBimestre1(bimestre1);
        this.setBimestre2(bimestre2);
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getBimestre1() {
        return bimestre1;
    }

    public void setBimestre1(double bimestre1) {
        this.bimestre1 = bimestre1;
    }

    public double getBimestre2() {
        return bimestre2;
    }

    public void setBimestre2(double bimestre2) {
        this.bimestre2 = bimestre2;
    }
    public double calcular_nota() {
        double nota = bimestre1 + bimestre2;
        return nota;
    }
    public String aprobacionMateria() {

        String aprobacion = "";
        double nota = calcular_nota();
        if (nota >= 27.5){
            aprobacion = "El estudiante ah aprobado la materia";
        }else{
            aprobacion = "El Estuidante se ah quedado a supletorios";
        }
        return aprobacion;
    }

    public void presentacion(){
        System.out.printf("Estudinte %s\nMateria de %s con calificaciones:\nPrimer Bimestre: %s y Segundo Bimestre: " +
                "%s\nTiene nota final: %s\n por lo tanto %s", getNombreEstudiante(), getNombreMateria(), getBimestre1()
                , getBimestre2(),calcular_nota(), aprobacionMateria());
    }
}
