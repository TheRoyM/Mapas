package co.edu.unac.poo1.clientes;

public class Cliente {
    protected Integer numeroCedula;
    private String nombreCompleto;
    private Float presupuesto;
    private Nacionalidad nacionalidad;

    public Cliente() {
    }

    public Cliente(Integer numeroCedula, String nombreCompleto, Float presupuesto, Nacionalidad nacionalidad) {
        this.numeroCedula = numeroCedula;
        this.nombreCompleto = nombreCompleto;
        this.presupuesto = presupuesto;
        this.nacionalidad = nacionalidad;
    }

    public Integer getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(Integer numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
