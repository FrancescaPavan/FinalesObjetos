package code.criterio;

import code.elemento.Elemento;

public class CantProductosMenorA implements Criterio{

    private Integer c;

    public CantProductosMenorA(Integer c) {
        this.c = c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public boolean acepta(Elemento e) {
        return e.getCantidad() < c;
    }
}
