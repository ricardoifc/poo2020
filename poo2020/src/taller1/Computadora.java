package taller1;

public class Computadora {
    private String tipoComputadora;
    private String sistemaOperativo;
    private String almacenamiento;
    private String ram;

    /**
     * Metodo para obtener el valor de la variable tipo computadora
     * @return
     */
    public String getTipoComputadora() {
        return tipoComputadora;
    }

    /**
     * Metodo para obtener el valor de la variable almacenamiento
     * @return
     */
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * Metodo para obtener el valor de la variable ram
     * @return
     */
    public String getRam() {
        return ram;
    }

    /**
     * Metodo para obtener el valor de la variable sistema operativo
     * @return
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     *
     * @param almacenamiento
     */
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     *
     * @param ram
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     *
     * @param sistemaOperativo
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     *
     * @param tipoComputadora
     */
    public void setTipoComputadora(String tipoComputadora) {
        this.tipoComputadora = tipoComputadora;
    }

}
