package code.descuentos;

import code.Libro;
import code.clientes.Clientela;

public class DescuentoMonto implements Descuento{

    private Double monto;
    private Float porcentaje;


    public DescuentoMonto(Double monto, Float porcentaje) {
        this.monto = monto;
        this.porcentaje = porcentaje;
    }

    @Override
    public Boolean elegible(Clientela cliente) {
        return cliente.getGastoTotal() >= monto;
    }

    @Override
    public Double aplicarDescuento(Libro libro) {
        return libro.getPrecio() - libro.getPrecio() * porcentaje;
    }
}
