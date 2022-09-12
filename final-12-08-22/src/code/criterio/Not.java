package code.criterio;

import code.elemento.Elemento;

public class Not implements Criterio{
    private Criterio c;

    public Not(Criterio c) {
        this.c = c;
    }

    public void setC(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean acepta(Elemento e) {
        return ! c.acepta(e);
    }
}
