package taller_repeticion;

public class Multiplicacion {
    private double factor1;
    private double factor2;
    private double producto=0;
    public Multiplicacion(double factor1,double factor2){
        this.factor1=factor1;
        this.factor2=factor2;
    }

    public double getFactor1() {
        return factor1;
    }

    public double getFactor2() {
        return factor2;
    }
    public double producto(){
        for(int i=0;i<factor2;i++){
            producto=producto+factor1;
        }
        return producto;
    }
}
