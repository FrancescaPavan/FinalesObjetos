package code.descuentos;

import code.Libro;
import code.clientes.Cliente;
import code.clientes.Clientela;

public interface Descuento {
    Boolean elegible(Clientela cliente);
    Double aplicarDescuento( Libro libro);
}
