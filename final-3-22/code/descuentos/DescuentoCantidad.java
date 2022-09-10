package code.descuentos;

import code.Libro;
import code.clientes.Clientela;

public class DescuentoCantidad implements Descuento {
    private Integer cantidad;
    private Float porcentaje;

    public DescuentoCantidad(Integer cant, Float porcentaje){
        this.cantidad = cant;
        this.porcentaje = porcentaje;
    }

    @Override
    public Boolean elegible(Clientela cliente) {
        return cliente.getCantCompras() >= cantidad;
    }

    @Override
    public Double aplicarDescuento(Libro libro) {
        return libro.getPrecio() - libro.getPrecio() * porcentaje;
    }
}
