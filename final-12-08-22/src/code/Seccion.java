package code;

import code.criterio.Criterio;
import code.elemento.Elemento;

import java.util.ArrayList;

public class Seccion {
    private ArrayList<Elemento> elementosAceptados;
    private Criterio criterio;

    public Seccion(Criterio criterio) {
        this.elementosAceptados = new ArrayList<>();
        this.criterio = criterio;
    }

    private void addElemento(Elemento e) {
        this.elementosAceptados = elementosAceptados;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public boolean acepta(Elemento e){
        if (criterio.acepta(e))
            elementosAceptados.add(e);
        else return false ;
        return true;
    }
}
