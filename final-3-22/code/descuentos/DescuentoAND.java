package code.descuentos;

import code.Libro;
import code.clientes.Clientela;

public class DescuentoAND implements Descuento{

    Descuento dto1;
    Descuento dto2;
    Float porcentaje;

    public DescuentoAND(Descuento dto1, Descuento dto2, Float porcentaje) {
        this.dto1 = dto1;
        this.dto2 = dto2;
        this.porcentaje = porcentaje;
    }

    @Override
    public Boolean elegible(Clientela cliente) {
        return dto1.elegible(cliente) && dto2.elegible(cliente);
    }

    @Override
    public Double aplicarDescuento(Libro libro) {
        return libro.getPrecio() - libro.getPrecio() * porcentaje;
    }
}
