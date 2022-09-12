package code.criterio;

import code.elemento.Elemento;

public class PalabraClave implements Criterio{

    private String palabra;

    public PalabraClave(String palabra) {
        this.palabra = palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean acepta(Elemento e) {
        return e.getNombre().contains(palabra);
    }
}
