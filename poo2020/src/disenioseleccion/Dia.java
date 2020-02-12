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
            case 1:  nombre = "Lunes"; break;
            case 2:  nombre = "Lunes"; break;
            case 3:  nombre = "Lunes"; break;
            case 4:  nombre = "Lunes"; break;
            case 5:  nombre = "Lunes"; break;
            case 6:  nombre = "Lunes"; break;
            case 7:  nombre = "Lunes"; break;
            default : nombre = "Opcion Incorrecta";
        }
        return nombre;
    }
    public void obtenerNombre(){
        System.out.println(calcularNombre());
    }

}
