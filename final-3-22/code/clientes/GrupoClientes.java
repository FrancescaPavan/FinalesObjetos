package code.clientes;

import code.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GrupoClientes extends Clientela{

    private ArrayList<Clientela> miembros;

    public GrupoClientes(){
        this.miembros = new ArrayList<>();
    }

    public void addMiembro(Clientela nuevo){
        this.miembros.add(nuevo);
    }

    @Override
    public boolean acepta(Libro libro) {
        for (Clientela c : miembros){
            if (c.acepta(libro))
                return true;
        }
        return false;
    }

    @Override
    public Integer getAntiguedad() {
        Integer max = 0;
        for (Clientela c : miembros){
            Integer antiguedad = c.getAntiguedad();
            if (max < antiguedad)
                max = antiguedad;
        }
        return max;
    }

    @Override
    public Integer getCantCompras() {
        Integer cantidad = 0;
        for (Clientela c : miembros){
            cantidad += c.getCantCompras();
        }
        return cantidad;
    }

    @Override
    public Double getGastoTotal() {
        Double gasto = 0d;
        for (Clientela c : miembros){
            gasto += c.getGastoTotal();
        }
        return gasto;
    }
}
