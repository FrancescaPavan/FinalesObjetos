package code.clientes;

import code.Libro;

import java.util.ArrayList;

public class Cliente extends Clientela{

    private Integer antiguedad;

    public ArrayList<String> getGenerosPreferidos() {
        return generosPreferidos;
    }

    private ArrayList<String> generosPreferidos;

    public Cliente(Integer antiguedad){
        super();
        this.antiguedad = antiguedad;
        this.generosPreferidos = new ArrayList<>();
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void addGeneroPreferido(String genero){
        this.generosPreferidos.add(genero);
    }

    @Override
    public boolean acepta(Libro libro) {
        for (String genero : generosPreferidos){
            if (libro.contieneGenero(genero))
                return true;
        }
        return false;
    }

    @Override
    public Integer getAntiguedad() {
        return this.antiguedad;
    }

    @Override
    public Integer getCantCompras() {
        return this.getLibrosComprados().size();
    }

    @Override
    public Double getGastoTotal() {
        Double gasto = 0d;
        for (Libro l : this.getLibrosComprados()){
            gasto += l.getPrecio();
        }
        return gasto;
    }
}
