package code.elemento;

import code.Supermercado;

public class Simple extends Elemento{

    private Float precio;
    private Integer peso;

    public Simple(String nombre, String clasificacion, Float precio, Integer peso) {
        super(nombre, clasificacion);
        this.precio = precio;
        this.peso = peso;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public Float getPrecio() {
        return this.precio + Supermercado.criterioRecargo.aplicar(this);
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public Integer getPeso() {
        return this.peso;
    }

    @Override
    public Integer getCantidad() {
        return 1;
    }

}
