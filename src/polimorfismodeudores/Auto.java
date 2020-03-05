package polimorfismodeudores;

public class Auto extends Deudor{
    private double interesM, total;

    public Auto(String nombre, String ci,double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.ci = ci;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }

    @Override
    public void calcularInteres() {
        interesM = capital* (Math.pow((1+ ((6.5/12)/100)), (plazos * 12))*(6.5/12)/100)/(Math.pow((1+ ((6.5/12)/100)),
                (plazos * 12))-1);
    }

    @Override
    public void calcularTotalInteres() {
        total = interesM * (plazos * 12) - capital;
    }

}
