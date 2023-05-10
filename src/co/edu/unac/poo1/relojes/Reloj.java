package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class Reloj {
    protected String numeroSerial;
    private String marca;
    private Float precio;
    private LocalDate fechaFabricacion;

    public Reloj() {
    }

    public Reloj(String numeroSerial, String marca, Float precio, LocalDate fechaFabricacion) {
        this.numeroSerial = numeroSerial;
        this.marca = marca;
        this.precio = precio;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }


}
