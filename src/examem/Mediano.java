package examem;

public class Mediano extends Lavadora{
    private int valorLav = 15;

    @Override
    public void calcularTotal() {
        if(getTipoAuto() == "tanquero"){
            total = (valorLav * getHora()) + ((valorLav * getHora())* 1.3);
        }else{
            total = valorLav* getHora();
        }
    }
}
