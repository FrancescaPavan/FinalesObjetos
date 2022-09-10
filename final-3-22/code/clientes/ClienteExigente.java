package code.clientes;

import code.Libro;

import java.util.ArrayList;

public class ClienteExigente extends Cliente{

    private ArrayList<String> autoresPreferidos;

    public ClienteExigente(Integer antiguedad) {
        super(antiguedad);
        this.autoresPreferidos = new ArrayList<>();
    }

    public void addAutorPreferido(String autor){
        this.autoresPreferidos.add(autor);
    }

    @Override
    public boolean acepta(Libro libro){
        for (String genero : this.getGenerosPreferidos()){
            if (libro.contieneGenero(genero) && this.autoresPreferidos.contains(libro.getAutor()))
                return true;
        }
        return false;
    }
}
