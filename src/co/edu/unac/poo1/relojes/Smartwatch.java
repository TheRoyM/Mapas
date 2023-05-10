package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class Smartwatch extends RelojPulso{
    private Double version;
    private String fabricante;

    public Smartwatch() {
        super();
    }

    public Smartwatch(String numeroSerial, String marca, Float precio, LocalDate fechaFabricacion, String materialPulso, Float precioPulso, Double version, String fabricante) {
        super(numeroSerial, marca, precio, fechaFabricacion, materialPulso, precioPulso);
        this.version = version;
        this.fabricante = fabricante;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
