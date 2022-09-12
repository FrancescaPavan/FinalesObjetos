package code.elemento;

import java.util.ArrayList;

public class Promo extends Elemento{

    private ArrayList<Elemento> elementos;

    public Promo(String nombre, String clasificacion) {
        super(nombre, clasificacion);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Elemento e){
        this.elementos.add(e);
    }

    @Override
    public Integer getPeso() {
        Integer peso = 0;
        for (Elemento e : elementos){
            peso += e.getPeso();
        }
        return peso;
    }

    @Override
    public Float getPrecio() { // TODO insertar criterio parametro
        Float precio = 0f;
        for (Elemento e : elementos){
            precio += e.getPrecio(); // TODO pasar param.
        }
        return precio;
    }

    @Override
    public Integer getCantidad() {
        Integer cant = 0;
        for (Elemento e : elementos){
            cant += e.getCantidad();
        }
        return cant;
    }
}
