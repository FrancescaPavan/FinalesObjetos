package code;

import code.criterio.Criterio;
import code.elemento.Elemento;

public class Recargo {
    private Criterio criterio;
    private Float montoCumple;
    private Float montoDefault;

    public Recargo(Criterio criterio, Float montoCumple, Float montoDefault) {
        this.criterio = criterio;
        this.montoCumple = montoCumple;
        this.montoDefault = montoDefault;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public void setMontoCumple(Float montoCumple) {
        this.montoCumple = montoCumple;
    }

    public void setMontoDefault(Float montoDefault) {
        this.montoDefault = montoDefault;
    }

    public Float aplicar(Elemento e){
        if (criterio.acepta(e))
            return e.getPrecio() + montoCumple;
        else return e.getPrecio() + montoDefault;
    }
}