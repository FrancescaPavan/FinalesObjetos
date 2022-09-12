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

    public Boolean chequarElemento(Elemento e){

    }

    public Boolean chequearPedido(Pedido p){
        for (Elemento e : p.getElementos()){
            boolean accepted = false;
            for (Seccion s : secciones){
                if (s.acepta(e)){
                    accepted = true;
                    break;
                }
            }
            if (!accepted)
                return false;
        }
        return true;
    }


}
