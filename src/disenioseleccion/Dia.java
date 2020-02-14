package disenioseleccion;

public class Dia {
    private int num;
    private String nombre;

    public int getNum() {
        return num;
    }
    public void establecerNum(int num) {
        this.num = num;
    }
    public String calcularNombre() {
        switch (num) {
            case 1:  nombre = "Lunes";
            break;
            case 2:  nombre = "Martes";
            break;
            case 3:  nombre = "Miercoles";
            break;
            case 4:  nombre = "Jueves";
            break;
            case 5:  nombre = "Viernes";
            break;
            case 6:  nombre = "Sabado";
            break;
            case 7:  nombre = "Domingo";
            break;
            default : nombre = "Opcion Incorrecta";
        }
        return nombre;
    }
    public String obtenerNombre(){
        nombre = calcularNombre();
        return nombre;
    }

}
