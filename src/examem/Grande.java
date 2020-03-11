package examem;

public class Grande extends Lavadora{
    private int valorLav = 20;

    @Override
    public void calcularTotal() {
        total = valorLav * getHora();
    }
}
