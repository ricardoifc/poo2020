package examem;

public class Pequenio extends Lavadora {
    private int valorLav = 10;

    @Override
    public void calcularTotal() {
        if(getTipoAuto() == "camioneta"){
            total = (valorLav * getHora()) + ((valorLav * getHora())* 1.2);
        }else{
            total = valorLav* getHora();
        }
    }
}
