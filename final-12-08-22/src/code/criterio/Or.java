package code.criterio;

import code.elemento.Elemento;

public class Or implements Criterio{
    private Criterio c1;
    private Criterio c2;

    public Or(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void setC1(Criterio c1) {
        this.c1 = c1;
    }

    public void setC2(Criterio c2) {
        this.c2 = c2;
    }

    @Override
    public boolean acepta(Elemento e) {
        return c1.acepta(e) || c2.acepta(e);
    }
}
