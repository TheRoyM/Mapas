package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class RelojPulso extends Reloj{
    protected String materialPulso;
    protected Float precioPulso;

    public RelojPulso() {
        super();
    }

    public RelojPulso(String numeroSerial, String marca, Float precio, LocalDate fechaFabricacion, String materialPulso, Float precioPulso) {
        super(numeroSerial, marca, precio, fechaFabricacion);
        this.materialPulso = materialPulso;
        this.precioPulso = precioPulso;
    }

    public String getMaterialPulso() {
        return materialPulso;
    }

    public void setMaterialPulso(String materialPulso) {
        this.materialPulso = materialPulso;
    }

    public Float getPrecioPulso() {
        return this.precioPulso + this.getPrecio();
    }

    public void setPrecioPulso(Float precioPulso) {
        this.precioPulso = precioPulso;
    }

    @Override
    public String toString() {
        return "Nombre reloj: " +getMarca() +
                " materialPulso: '" + materialPulso + '\'' +
                ", precioPulso: " + precioPulso +
                ", numeroSerial: '" + numeroSerial + '\'';
    }
}
