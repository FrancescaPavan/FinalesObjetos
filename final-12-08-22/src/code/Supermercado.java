package code;

import code.elemento.Elemento;

import java.util.ArrayList;

public class Supermercado {
    public static Recargo criterioRecargo;
    ArrayList<Seccion> secciones = new ArrayList<>();
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void setCriterioRecargo(Recargo criterioRecargo) {
        Supermercado.criterioRecargo = criterioRecargo;
    }

    public Boolean chequarElemento(Elemento e) {
        for (Seccion s : secciones) {
            if (s.acepta(e)) {
                return true;
            }
        }
        return false;
    }

    public Boolean chequearPedido(Pedido p){
        for (Elemento e : p.getElementos()){
            if (! chequarElemento(e))
                return false;
        }
        return true;
    }

    public Pedido copiaAceptados(Pedido p){
        Pedido pedidoNuevo = new Pedido(p.getNombreCliente(), p.getDireccion(),new ArrayList<>(),p.getNroLocal());
        for (Elemento e : p.getElementos()){
            if (chequarElemento(e)){
                pedidoNuevo.addElemento(e);
            }
        }
        return pedidoNuevo;
    }

    public Seccion aceptaTodo(Pedido p){
        for (Seccion s: secciones){
            boolean all = true;
            for (Elemento e: p.getElementos()){
                if (!s.acepta(e)){
                    all = false;
                    break;
                }
            }
            if (all)
                return s;
        }
        return null;
    }

    public Float totalCost(Pedido p){
        Float cost = 0f;
        for (Elemento e : p.getElementos()){
            cost += criterioRecargo.aplicar(e);
        }
        return cost;
    }


}
