package code.criterio;

import code.elemento.Elemento;

public class PrecioMenorA implements Criterio{

    private Float p;

    public PrecioMenorA(Float p) {
        this.p = p;
    }

    public void setP(Float p) {
        this.p = p;
    }

    @Override
    public boolean acepta(Elemento e) {
        return e.getPrecio() < this.p;
    }
}
