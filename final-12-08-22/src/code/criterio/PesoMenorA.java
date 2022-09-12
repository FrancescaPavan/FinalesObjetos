package code.criterio;

import code.elemento.Elemento;

public class PesoMenorA implements Criterio{

    private Integer p;

    public PesoMenorA(Integer p) {
        this.p = p;
    }

    public void setC(Integer p) {
        this.p = p;
    }

    @Override
    public boolean acepta(Elemento e) {
        return e.getPeso() < p;
    }
}
