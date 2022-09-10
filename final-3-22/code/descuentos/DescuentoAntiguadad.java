package code.descuentos;

import code.Libro;
import code.clientes.Clientela;

public class DescuentoAntiguadad implements Descuento{

    private Integer antiguedad;
    private Float porcentaje;

    public DescuentoAntiguadad(Integer antiguedad, Float porcentaje) {
        this.antiguedad = antiguedad;
        this.porcentaje = porcentaje;
    }

    @Override
    public Boolean elegible(Clientela cliente) {
        return cliente.getAntiguedad() >= antiguedad;
    }

    @Override
    public Double aplicarDescuento(Libro libro) {
        return libro.getPrecio() - libro.getPrecio() * porcentaje;
    }
}
